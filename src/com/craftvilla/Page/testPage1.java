package com.craftvilla.Page;

//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import generic.BasePage;

public class testPage1 //extends BasePage
{
	WebDriver driver;
	@FindBy(xpath="//button[@id='submitpincode']")	
	private WebElement checkbtn;
	

	public testPage1()
	{
		PageFactory.initElements(driver,this);
	}
	
public void clickbtn()
{
	checkbtn.click();
}
}
