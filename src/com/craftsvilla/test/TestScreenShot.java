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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.IAutoConst;

public class TestScreenShot implements IAutoConst{
	static
	{
		System.setProperty(CHROMEKEY, CHROMEVALUE);
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.craftsvilla.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String v = sdf.format(new Date());
		Robot r;
		try {
			r = new Robot();
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle ScreenRect=new Rectangle(d);
			BufferedImage img = r.createScreenCapture(ScreenRect);
		
			File dst=new File("/home/tyss/Desktop/hi"+v+".png");
			ImageIO.write(img, ".png", dst);
			
			}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
		}
		

	}

}
