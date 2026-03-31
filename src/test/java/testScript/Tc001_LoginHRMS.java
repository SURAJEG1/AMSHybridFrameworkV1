package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import listenerUtility.Listener;
import pageObjectClasses_HRMS.HRMSLogin_PageObject;
import utilities.ReadExcelFile;

@Listeners(Listener.class)
public class Tc001_LoginHRMS extends BaseTestClass{
	
	
	@Test(dataProvider = "credentials")
	public void varifyHRMSLoginFunctionality(String un, String pwd) 
	{
		driver.get(hrmsUrl);
		HRMSLogin_PageObject login = new HRMSLogin_PageObject(driver);
		login.enterUsername(un);
		login.enterPassword(pwd);
		login.clickOnLoginButton();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	
	}
	
	
	@DataProvider(name = "credentials")
	public Object[][] dataDriven() throws IOException
	{
		String filePath = "E:\\InfoEge Automation Project\\practice\\ExcelFile\\loginDetails.xlsx";
		String sheetName = "login";
		
		return ReadExcelFile.excelDriven(filePath, sheetName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
