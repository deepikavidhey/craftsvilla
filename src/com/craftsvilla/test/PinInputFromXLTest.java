package com.craftsvilla.test;

//import java.awt.Robot;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.BasicConfigurator;
import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.log4testng.Logger;

public class PinInputFromXLTest //implements IAutoConst
{
	static
	{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
		
	}
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.craftsvilla.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Robot r= new Robot();
		
	
		
		WebElement we=driver.findElement(By.xpath("//a[contains(@href,'megamenu_sarees_seeall')]"));
		we.click();
		Thread.sleep(2000);
		WebElement we1 = driver.findElement(By.xpath("//*[@id='listProducts']/..//img[contains(@src,'1497084488')]"));
		we1.click();
		
		
		FileInputStream fis=new FileInputStream("/home/tyss/Desktop/pincheck1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	
		int n = wb.getSheet("Sheet1").getLastRowNum();
	
		for(int i=1;i<=n;i++)
		{			
			Cell c = wb.getSheet("Sheet1").getRow(i).getCell(0);
			// wb.getSheet("Sheet1").getLastRowNum();
			double d = c.getNumericCellValue();
			
			int j=(int)d;
			String str=Integer.toString(j);
			
			WebElement pin4 = driver.findElement(By.id("pincode_value"));
			pin4.sendKeys(str);
			Thread.sleep(2000);
			
			
			/*
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",pin4);*/
			
			
			WebElement pinchk1 = driver.findElement(By.xpath("//button[@id='submitpincode']"));
			
			pinchk1.click();
			Thread.sleep(2000);
			
			WebElement errmsg=driver.findElement(By.id("error-message"));
			if(errmsg.isDisplayed())
			{
			pin4.clear();
			pin4.sendKeys(str);
			pinchk1.click();
			}
			else
			{
			WebElement chng1 = driver.findElement(By.xpath("//span[@class='pdp-pin-change-check']"));
			chng1.click();
			}
			pin4.clear();
		}
		driver.quit();

	}

}
