package extentReportTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.baseClass.BaseClass;

import extentReportLibrary.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTest extends BaseClass
{
	
	@BeforeMethod
	public void setup()
	{
		launchBrowser();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		driver.quit();
		if(ITestResult.SUCCESS==result.getStatus())
		{
			ExtentLibrary.extentReport(driver,result.getName());
		}
	}
	
	@Test
	public void reportTest() throws Throwable
	{
		
		new com.actiTimePages.LoginPage().loginPage(prop.getProperty("username"), prop.getProperty("password"));
		ExtentLibrary.extentReport(driver,"demo");
		
	}
}
