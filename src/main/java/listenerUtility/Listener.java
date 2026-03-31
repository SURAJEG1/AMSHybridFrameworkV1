package listenerUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listener implements ITestListener{

	WebDriver driver;
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + ": Testcase Started...");
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + ": Successfully Executed...");
	}

	
	public void onTestFailure(ITestResult result) {
		try {
			
			System.out.println(result.getName() + ": Got failed & Screenshot Captured...");
			TakesScreenshot ts = (TakesScreenshot)driver;
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHssMM").format(new Date());
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination =  new File("E:\\InfoEge Automation Project\\practice\\Screenshot\\failed\\testcase"+timestamp+".png");
			FileUtils.copyFile(source, destination);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
