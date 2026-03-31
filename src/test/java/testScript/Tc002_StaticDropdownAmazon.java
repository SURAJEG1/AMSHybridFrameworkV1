package testScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listenerUtility.Listener;
import pageObjectClasses_Amazon.AmazonStaticDropdownPageObject;

@Listeners(Listener.class)
public class Tc002_StaticDropdownAmazon extends BaseTestClass{
	
	
	@Test
	public void verifyAmazonStaticDropdown() 
	{
		driver.get(amazonUrl);
		
		AmazonStaticDropdownPageObject dropdown = new AmazonStaticDropdownPageObject(driver);
		dropdown.staticDropdown_SelectByIndex();
		dropdown.staticDropdown_SelectByValue();
		dropdown.staticDropdown_SelectBySendKeys();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
