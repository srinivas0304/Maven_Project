package screenshotLibrary;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility
{
	
	public static void captureScreenShot(WebDriver driver, String screenshotName)
	{
		try
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshot/"+screenshotName+".jpg"));
			System.out.println("Successfullt screenshot taken");
		}
		catch(Exception e)
		{
			System.out.println("Exception while taking screenshot"+e.getMessage());
		}
	}
}
