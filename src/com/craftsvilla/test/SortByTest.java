package com.craftsvilla.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.IAutoConst;

public class SortByTest implements IAutoConst
{
	static
	{
		System.setProperty(CHROMEKEY, CHROMEVALUE);
	}

	public static void main(String args[])// throws InterruptedException
	{
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.craftsvilla.com");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.HOURS);

	WebElement we=driver.findElement(By.xpath("//img[@class='img-responsive' and  @title='Jhumkas' and @alt='Jhumkas']"));
	int x =we.getLocation().getX();
	int y =we.getLocation().getY();
	js.executeScript("window.scrollBy("+x+","+y+")");
	we.click();
	
	WebElement sortLtoH=driver.findElement(By.id("priceOrder_ASC"));
	sortLtoH.click();
	
	WebElement sortHtoL=driver.findElement(By.id("priceOrder_DESC"));
	sortHtoL.click();	

	WebElement discount=driver.findElement(By.id("discountedPriceOrder_DESC"));
	discount.click();
	
	WebElement chkbox=driver.findElement(By.id("showcodlabel"));
	chkbox.click();	
	//Thread.sleep(2000);
		
	WebElement gridbig=driver.findElement(By.xpath("//span/i[@class='icon cv-grid-big']"));
	gridbig.click();
	//Thread.sleep(2000);
	
	WebElement gridsmall=driver.findElement(By.xpath("//span/i[contains(@class,'icon cv-grid-small')]"));
	gridsmall.click();
	
	driver.quit();
	}
}
