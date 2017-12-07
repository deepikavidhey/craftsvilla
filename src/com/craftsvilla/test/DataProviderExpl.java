package com.craftsvilla.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExpl {
	static
	{
	System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
	}
	@DataProvider
	public Object[][] getdata()
	{
	Object[][] obj=new Object[2][2];
	obj[0][0]="user";
	obj[0][1]=123;
	obj[1][0]="pwd";
	obj[1][1]=456;
	return obj;
	}
	
	@Test(dataProvider="getdata")
	public void verify(String un,int pwd)
	{
		Reporter.log(un+pwd,true);
	/*	WebDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		action.moveToElement(null).perform();
		action.dragAndDrop(null, null).perform();
		action.sendKeys(keys.CONTROL).click(null).perform();
		action.doubleClick(null).perform();
		action.contextClick(null).perform();*/
	}
}
