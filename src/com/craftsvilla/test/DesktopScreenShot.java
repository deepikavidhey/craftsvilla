package com.craftsvilla.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import java.awt.AWTException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DesktopScreenShot {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","/home/tyss/Desktop/DeepPractice/Automation/driver/geckodriver");
	
		
	//	driver.get("http://seleniumhq.org");
		
		FirefoxProfile profile=new FirefoxProfile();
		
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		
		WebDriver driver=new FirefoxDriver(profile);
		
		driver.get("http://http://www.seleniumhq.org/download/");		
	
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='menu_download']/a")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='mainContent']/p[3]/a")).click();
		
	/*	SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String v=sdf.format(new Date());
			
		TakesScreenshot t=(TakesScreenshot)driver;
			
		File src=t.getScreenshotAs(OutputType.FILE);
		File dst=new File("/Automation/TestFailedPics/hi"+v+".png");
		
FileUtils.copyFile(src, dst);*/
	}

}
