package com.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentClassTest 
{	
	public static WebDriver driver;
	@Test
	public void demo() throws IOException
	{
		ExtentReports extReport = new ExtentReports();
		ExtentSparkReporter sparkReport = new ExtentSparkReporter("C:\\Users\\addla\\Maven_Project\\ActitimeProject\\ExtentReport\\sreports.html");
		extReport.attachReporter(sparkReport);

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String path=takingScreenShot("Google.jpg");


		ExtentTest test = extReport.createTest("Test 1","Taking the screenshot");
		test.info("This is info msg");
		test.addScreenCaptureFromPath(path);

	}
	
	public static String takingScreenShot(String filename) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destiFile = new File(".\\Screenshots\\"+filename);
		FileUtils.copyFile(srcFile,destiFile );
		return destiFile.getAbsolutePath();

		}
}
