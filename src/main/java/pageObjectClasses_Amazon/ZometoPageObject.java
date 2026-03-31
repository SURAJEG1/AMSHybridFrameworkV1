package pageObjectClasses_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZometoPageObject {
	//Create Object of WebDriver interface
	WebDriver driver;
	
	//Constructor
	public ZometoPageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//input[@placeholder='Phone']") WebElement phoneNo;
	@FindBy (xpath = "//button[@role='button']") WebElement clickOnOtp;
	
	
	public void switchToIframe() 
	{
		driver.switchTo().frame("auth-login-ui");
	}
	
	public void switchToDefaultContain() 
	{
		driver.switchTo().defaultContent();
	}
	
	public void enterPhoneNo(String mob) 
	{
		phoneNo.sendKeys(mob);
	}
	
	
	public void clickedOnOneTimePassword() 
	{
		clickOnOtp.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
