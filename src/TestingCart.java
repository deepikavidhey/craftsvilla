import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.craftvilla.Page.JhumkasPage;
//import org.openqa.selenium.interactions.Actions;
//import generic.BaseTest;
import generic.IAutoConst;

public class TestingCart implements IAutoConst{
		static
		{
			System.setProperty(CHROMEKEY, CHROMEVALUE);
		}
	
		public static void main(String args[]) throws InterruptedException
		{
			
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.craftsvilla.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.HOURS);
		
		
		WebElement acceso = driver.findElement(By.xpath("//a[@href='/accessories/?MID=megamenu_accessories_seeall']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(acceso).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'accessories_accessories_watches')]")).click();
		
		driver.findElement(By.id("priceOrder_DESC")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[contains(@src,'MSHOB28549141970--Shobhanita-1477054196-Craftsvilla')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("addtocart")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[contains(@class,'plus-blue js-plus')]")).click();
		
		driver.findElement(By.xpath("//span[contains(@class,'image minus-blue js-minus')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@ id='remove-item-btn']")).click();
		Thread.sleep(5000);
		WebElement we = driver.findElement(By.xpath("//div[text()='Your cart is Empty']"));
		String s = we.getText();
		if(s.contains("Empty"))
		{
			System.out.println("Success-> item Removed "+s);

		}
			driver.quit();
		}}
