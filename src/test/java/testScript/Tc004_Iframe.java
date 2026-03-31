package testScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listenerUtility.Listener;
import pageObjectClasses_Amazon.ZometoPageObject;

@Listeners(Listener.class)
public class Tc004_Iframe extends BaseTestClass{
	
	
	@Test
	public void handleIframe() 
	{
		driver.get(zometoUrl);
		
		ZometoPageObject iframe = new ZometoPageObject(driver);
		iframe.switchToIframe();
		iframe.enterPhoneNo("1010101010");
		iframe.clickedOnOneTimePassword();
		iframe.switchToDefaultContain();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
