package browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
	}
}
