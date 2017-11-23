package com.craftvilla.Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Reporter;

import generic.BasePage;

public class CartPage extends BasePage
{
	//public WebDriver driver;
	
	@FindBy(xpath="//a[@href='/accessories/?MID=megamenu_accessories_seeall']")
	private WebElement accessories; 
	
	public CartPage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	
	public void clicking()
	{
		//sleep(2);
		//verifyElement(accessories);
		accessories.click();
		/*sleep(5);
		watches.click();
		sleep(5);
		Kundanwatch.click();
		sleep(5);
		HiToLow.click();
		sleep(5);
		addbtn.click();
		sleep(5);
		minusbtn.click();
		sleep(5);
		removebtn.click();*/
	}
	/*
	@FindBy(xpath="//a[contains(@href,'accessories_accessories_watches')]")
	private WebElement watches; 
	
	@FindBy(xpath="//img[contains(@src,'MSHOB28549141970--Shobhanita-1477054196-Craftsvilla')]")
	private WebElement Kundanwatch; 
	
	@FindBy(id="priceOrder_DESC")
	private WebElement HiToLow;
	
	@FindBy(id="addtocart")
	private WebElement addbtn;
	
	@FindBy(xpath="//span[contains(@class,'image minus-blue js-minus')]")
	private WebElement minusbtn;

	@FindBy(xpath="//button[@ id='remove-item-btn']")
	private WebElement removebtn;
	
	@FindBy(xpath="//div[text()='Your cart is Empty']")
	private WebElement check;*/
		
	
	/*public void verify()
	{
		String s = check.getText();
		if(s.contains("Empty"))
		{
			Reporter.log(s,true);
		}
	}*/


	/*public void mousehoveNclick()
	{
		verifyElement(driver,10,accessories);
		Actions action=new Actions(driver);
		action.moveToElement(accessories).build().perform();
		accessories.click();
		
	}*/
}

