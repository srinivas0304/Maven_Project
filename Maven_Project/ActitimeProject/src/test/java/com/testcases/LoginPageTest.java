package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;
import com.actiTimePages.LoginPage;

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
		new com.actiTimePages.LoginPage().loginPage(prop.getProperty("username"), prop.getProperty("password"));
	}
	
}
