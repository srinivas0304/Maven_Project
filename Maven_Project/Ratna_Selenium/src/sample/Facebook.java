package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import screenshotLibrary.Utility;

public class Facebook
{
	WebDriver driver;
	@Test
	public void captureScreenshot()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Selenium");
		
		Utility.captureScreenShot(driver, "captureScreenshotFb");
	}
	
	@AfterMethod
	
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenShot(driver, result.getName());
		}
	}
}
