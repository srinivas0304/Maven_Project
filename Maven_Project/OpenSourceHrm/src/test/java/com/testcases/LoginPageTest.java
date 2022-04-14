package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actiTimePages.LoginPage;
import com.baseClass.BaseClass;

public class LoginPageTest extends BaseClass
{
	@BeforeMethod
	public void setup()
	{
		launchBrowser();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void loginTest() throws Throwable
	{
		new LoginPage().loginPage(prop.getProperty("username"), prop.getProperty("password"));
	}
}
