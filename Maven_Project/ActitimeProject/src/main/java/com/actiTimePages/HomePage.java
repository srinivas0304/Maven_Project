package com.actiTimePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actionDriver.Action;
import com.baseClass.BaseClass;

public class HomePage extends BaseClass
{
	@FindBy(xpath="//input[@class='taskSearchField']") public WebElement search;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchBox() throws Exception
	{
		Thread.sleep(2000);
		search.sendKeys("srinivas");
	}
}
