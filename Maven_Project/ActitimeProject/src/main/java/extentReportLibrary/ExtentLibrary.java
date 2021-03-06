package extentReportLibrary;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentLibrary 
{
	public static void extentReport(WebDriver driver, String path)
	{
		try
		{
			ExtentSparkReporter htmlReporter = new ExtentSparkReporter("./Reports/demo.html");
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			ExtentTest test = extent.createTest("FirstTestcase");
			test.log(Status.INFO, "FirstTestcase");
			test.log(Status.PASS, "FirstTestcase");
			extent.flush();
		}
		catch(Exception e)
		{
			System.out.println("Exception while taking screeshot: "+e.getMessage());
		}	
	}
}
