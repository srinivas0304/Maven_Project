package dataProvider;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Sample 
{
//	public WebDriver driver;
//	
//	@Test(dataProvider="Actitime")
//	public void login(String username, String password) throws Exception 
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.name("pwd")).sendKeys(password);
//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
//		Thread.sleep(5000);
//		String title=driver.getTitle();
//		//System.out.println(title);
//		if(title.equals(""))
//		{
//			System.out.println("Page title verified - user is able to login successfully");
//			System.out.println("The login credentails are: username:"+username+"Password"+password);
//		}
//		else
//		{
//			System.out.println("Unable to login");
//			System.out.println("The login credentails are: username:"+username+"Password"+password);
//		}
//	}
//	
//	@AfterMethod
//	public void tearDown() 
//	{
//		driver.quit();
//	}
//	
//	@DataProvider(name="Actitime")
//	public Object[][] passData()
//	{
//		Object[][] data=new Object[4][2];
//		
//		data[0][0]="Ad";
//		data[0][1]="manager";
//		
//		data[1][0]="Admin";
//		data[1][1]="admin123";
//		
//		data[2][0]="Admin";
//		data[2][1]="admin1234";
//		
//		data[3][0]="Admin";
//		data[3][1]="admin1234";
//		return data;
//	}
	
	public WebDriver driver;
	
	@Test(dataProvider="OrangeHrm")
	public void login(String userName, String password) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		if(title.equals(""))
		{
			System.out.println("Page title verified - user is able to login successfully");
			System.out.println("The login credentails are: username:"+userName+"Password"+password);
		}
		else 
		{
			
			System.out.println("Unable to login");
			System.out.println("The login credentails are: username:"+userName+"Password"+password);
		}
		
	}
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	@DataProvider(name="OrangeHrm")
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="admin1";
		data[0][1]="manager";
		
		data[1][0]="admin";
		data[1][1]="manager";
		
		data[2][0]="Admin";
		data[2][1]="admin1234";
		return data;
	}	
}
