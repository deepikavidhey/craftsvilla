package generic;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListner implements ITestListener,IAutoConst
{
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String v = sdf.format(new Date());
		/*//TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("/home/tyss/Desktop/DeepPractice/Automation/TestFailedPics"+v+".png");
		try 
		{
			FileUtils.copyFile(src, dst);//copyFile(src,dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		*/
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
		
		
		

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
