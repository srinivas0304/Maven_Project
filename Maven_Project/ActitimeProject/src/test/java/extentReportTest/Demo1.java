package extentReportTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo1
{
	
	public static void main(String[] args) {
	
	ExtentReports extReport = new ExtentReports();
	ExtentSparkReporter sparkReport = new ExtentSparkReporter("C:\\Users\\addla\\Maven_Project\\ActitimeProject\\ExtentReport\\sreports.html");
	extReport.attachReporter(sparkReport);
	ExtentTest test = extReport.createTest("Test 1","Taking the screenshot");
	test.info("This is info msg");
	System.out.println("generated");
	
	}
}
