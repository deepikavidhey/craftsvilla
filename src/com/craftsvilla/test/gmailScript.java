package com.craftsvilla.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailScript 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
		
	}

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deepikashekar1988@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(2000);
		
		
		String s = driver.getWindowHandle();
		driver.switchTo().window(s);
		
		driver.findElement(By.xpath("//img[@class='Ha']")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}
