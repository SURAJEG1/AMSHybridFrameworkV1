package extentReportUtility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportManager {


	//Create static object of ExtentReports class 
	public static ExtentReports extentreports;

	public static ExtentReports getExtentReports() 
	{

		if(extentreports == null)
		{
			String reportPath = System.getProperty("user.dir") + "/reports/extent-report.html";
			File reportsFolder = new File(System.getProperty("user.dir") + "/reports");

			if(!reportsFolder.exists()) 
			{
				reportsFolder.mkdirs();
			}


			//Configuration to change look and feel of report
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
			reporter.config().setReportName("Automation Test Report");
			reporter.config().setDocumentTitle("Extent Report");
			reporter.config().setTheme(Theme.STANDARD);
			reporter.config().setTimeStampFormat("EEEE, MMMM dd, YYYY, hh:mm a('ZZZ')");


			extentreports = new ExtentReports();
			extentreports.attachReporter(reporter);
			extentreports.setSystemInfo("Tester", "Suraj");
			extentreports.setSystemInfo("OS", "Windows11");
			extentreports.setSystemInfo("Browser", "chrome");
			extentreports.setSystemInfo("Machine", "Tester LP");
		}
		
		return extentreports;


	}




















}
