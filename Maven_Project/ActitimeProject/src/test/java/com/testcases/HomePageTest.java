package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;
import com.actiTimePages.HomePage;
import com.actiTimePages.LoginPage;

public class HomePageTest extends BaseClass
{
	
	com.actiTimePages.HomePage homePage;
	
	@BeforeMethod
	public void setup()
	{
		launchBrowser();
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
	@Test
	public void verifyHomeTitle() throws Throwable
	{
		homePage=new com.actiTimePages.LoginPage().loginPage(prop.getProperty("username"), prop.getProperty("password"));
		String act=driver.getTitle();
		System.out.println(act);
		homePage.searchBox();	
		String act1=driver.getTitle();
		System.out.println(act1);
	}
}	
