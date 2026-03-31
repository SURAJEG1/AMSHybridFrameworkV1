package pageObjectClasses_HRMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMSLogin_PageObject {
	
	//create object of WebDriver interface
	WebDriver driver;
	
	
	//constructor
	public HRMSLogin_PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement username;
	@FindBy (xpath = "//input[@placeholder='Password']") WebElement password;
	@FindBy (xpath ="//button[@type='submit']") WebElement lgButton;
	
	
	
	public void enterUsername(String un) 
	{
		username.sendKeys(un);
	}
	
	
	public void enterPassword(String pwd) 
	{
		password.sendKeys(pwd);
	}
	
	
	public void clickOnLoginButton() 
	{
		lgButton.click();
	}
	
	
	
	
	
	
	
	
	

}
