package pageObjectClasses_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonStaticDropdownPageObject {
	
	//create object of WebDriver interface;
	WebDriver driver;
	
	//constructor
	public AmazonStaticDropdownPageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (id = "searchDropdownBox") WebElement dropdown;
	
	
	public void staticDropdown_SelectByValue() 
	{
		Select sc = new Select(dropdown);
		sc.selectByValue("search-alias=alexa-skills");
	}
	
	
	public void staticDropdown_SelectByIndex() 
	{
		Select sc = new Select(dropdown);
		sc.selectByIndex(4);
	}
	
	
	public void staticDropdown_SelectBySendKeys() 
	{
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
