import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	
		static
		{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
		}
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
	    	driver.get("https://www.google.com");
	    	driver.manage().window().maximize();
	    //	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //	driver.findElement(By.id("lst-ib")).sendKeys("baggit sling bags");
	    	try
	    	{
	    		Robot r=new Robot();
	    		r.keyPress(KeyEvent.VK_ALT);
	    		r.keyPress(KeyEvent.VK_SPACE);
	    		r.keyRelease(KeyEvent.VK_SPACE);
	    		r.keyRelease(KeyEvent.VK_ALT);
	    		Thread.sleep(2000);
	  /*  		r.keyPress(KeyEvent.VK_N);
	    		r.keyRelease(KeyEvent.VK_N);*/
	    		r.keyPress(KeyEvent.VK_C);
	    		r.keyRelease(KeyEvent.VK_C);
	    	
	    	}
	    	
	    
	    	catch(Exception e)
	    	{
	    		
	    	}
	    	
	    	

  //	driver.close();
		}}

	


