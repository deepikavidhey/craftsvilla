package com.craftsvilla.test;


import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Test1 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
	}
	public static void main(String args[]) throws Exception
	{
	
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.craftsvilla.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hi')");
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		String s = driver.getWindowHandle();
		driver.switchTo().window(s);
		
		/*SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String v = sdf.format(new Date());
		//TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("/home/tyss/Desktop/DeepPractice/Automation/TestFailedPics"+v+".png");
		try 
		{
			FileUtils.copyFile(src, dst);//copyFile(src,dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Robot r;
		try {
			r = new Robot();
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle ScreenRect=new Rectangle(d);
			BufferedImage img = r.createScreenCapture(ScreenRect);
		
			File dst=new File("/home/tyss/Desktop/DeepPractice/Automation/TestFailedPics"+v+".png");
			ImageIO.write(img, ".png", dst);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
	//	log.warn("-------------------*******************------------------------------------------------");
		//BasicConfigurator.configure();
	
	*/
/*
	//Typecasting
	TakesScreenshot ts=(TakesScreenshot)driver;
	//int outputType;
	File srcfile=ts.getScreenshotAs(OutputType.FILE);
	File destfile=new File("d:/selfi");
	FileUtils.copyFile(srcfile, destfile);
	
	
	WebElement we=driver.findElement(By.xpath("//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']"));
		if(we.isEnabled())
		{
			Actions a=new Actions(driver);
			a.moveToElement(we).perform();
			System.out.println("PASS");
			we.click();
		}
	
		Thread.sleep(2000);*/
	//	driver.quit();
//		Logger log = Logger.getLogger("log4j.properties");
		//	log.info("Hi Welcome");
				//Upcasting
			//Downcasting
			//RemoteWebDriver rwd=(RemoteWebDriver)driver;
	//	log.info("Browser opened");
		/*
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs("jumka"));*/
	
	}
}
