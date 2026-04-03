package listenerUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import extentReportUtility.ExtentReportManager;


public class Listener implements ITestListener{
	
	private static ExtentReports extentreports;
	private static ExtentTest test;
	

	@Override
	public void onStart(ITestContext context) 
	{
		extentreports = ExtentReportManager.getExtentReports();
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		test = extentreports.createTest(result.getName());
		//System.out.println(result.getName() + ": Testcase Started...");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS, "Test case PASSED");
		//System.out.println(result.getName() + ": Successfully Executed...");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		test.log(Status.FAIL, "Test case FAILED");
		
	}
	
	
	@Override
	public void onFinish(ITestContext context) 
	{
		extentreports.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
