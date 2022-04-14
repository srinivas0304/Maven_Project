package com.actiTimePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actionDriver.Action;
import com.baseClass.BaseClass;

public class LoginPage extends BaseClass
{
	
////	@FindBy(xpath="//*[@id=\"txtUsername\"]")
////	WebElement userName;
//	
//	@FindBy(name="username")
//	WebElement username;
//	
////	@FindBy(xpath="//*[@id=\"txtPassword\"]")
////	WebElement passWord;
//	
//	@FindBy(name="pwd")
//	WebElement password;
//	
////	@FindBy(xpath="//*[@id=\"btnLogin\"]")
////	WebElement submitBtn;
//	
//	@FindBy(id="loginButton")
//	WebElement loginButton;
//	
//	
//	public void LoginPage()
//	{
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void login(String un, String pass) throws Exception
//	{
////		Action.type(username, un);
////		Action.type(password, pass);
////		loginButton.click();
//		
//		username.sendKeys(un);
//		password.sendKeys(pass);
//		loginButton.click();
//	}

	
	@FindBy(name="username") public WebElement untb;

	@FindBy(name="pwd") public WebElement passWord;

	@FindBy(id="loginButton") public WebElement lgnbutton;

	public LoginPage() 
	{
	PageFactory.initElements(driver, this);
	}

	public String verifyLoginPage() throws Throwable {
	String ActitimeLoginPagetitle = new Action().getTitle(driver);
	return ActitimeLoginPagetitle;

	}

	public HomePage loginPage(String un,String pwd) throws Throwable {
	new Action().type(untb, un);
	new Action().type(passWord, pwd);
	//new Action().click(driver, lgnbutton,);
	lgnbutton.click();
	return new HomePage();
	
	}
}
