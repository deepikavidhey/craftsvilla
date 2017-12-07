package com.craftsvilla.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import java.awt.AWTException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesktopScreenShot {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("http://www.google.com");
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String v=sdf.format(new Date());
			
		TakesScreenshot t=(TakesScreenshot)driver;
			
		File src=t.getScreenshotAs(OutputType.FILE);
		File dst=new File("/Automation/TestFailedPics/hi"+v+".png");
		
FileUtils.copyFile(src, dst);
	}

}
