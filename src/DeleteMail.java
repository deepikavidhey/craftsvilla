import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class DeleteMail {
	static
	{
		System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/chromedriver");
	}

	public static void main(String[] args) throws Exception 
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.gmail.com");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("identifierId")).sendKeys("deepikashekar1988@gmail.com");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @type='password']")).sendKeys("qwerty@@1357");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2000);
			/*WebElement we = driver.findElement(By.xpath("//a[text()='Shopping']"));
			Actions act=new Actions(driver);
			act.moveToElement(we).perform();
			Thread.sleep(5000);*/
			driver.findElement(By.xpath("(//span[text()='More'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Trash']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='T-Jo-auh' and @role='presentation'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Delete forever']")).click();
			driver.close();
	}

}
