package generic;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

//import com.craftsvilla.test.CustomListner;

@Listeners(CustomListner.class)
public abstract class BaseTest implements IAutoConst {
	public static WebDriver driver;

	public static Logger log;
	
	

	@BeforeMethod(alwaysRun = true)
	public void LaunchApp() {
		//BasicConfigurator.configure();
		log = Logger.getLogger("log4j.log");
		//log.info("sdffsdfsdfsdf");*/
		System.setProperty(CHROMEKEY, CHROMEVALUE);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.craftsvilla.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterMethod(alwaysRun = true)
	public void closeApp() {

		driver.quit();

	}
}
