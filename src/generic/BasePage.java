package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public void verifyTitle(WebDriver driver,String title)
	{
		String actual=driver.getTitle();
		Assert.assertEquals(actual, title);
	}

	public void verifyTitle(WebDriver driver,long time,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
		try
		{
			wait.until(ExpectedConditions.titleIs(title));
			Reporter.log("Title is matching");
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching");
		}
	}
	public void verifyElement(WebElement element)
	{
		Assert.assertTrue(element.isDisplayed());
	}
	public void verifyElement(WebDriver driver,long time,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present",true);
			Assert.fail();
		}
	}
	
	public void sleep(int i)
	{
		try
		{
			Thread.sleep(i*1000);
		}
		catch(Exception e)
		{
		}
		
	}

}
