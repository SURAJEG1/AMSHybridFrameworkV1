package testScript;

import java.awt.AWTException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listenerUtility.Listener;
import pageObjectClasses_Amazon.FacebookHomePageObject;
import reusableComponents.ReusableMethods;

@Listeners(Listener.class)
public class Tc004_MouseHoverAction extends BaseTestClass{
	
	
	@Test
	public void mouseHoverRightClickActionOnInstagram() throws AWTException, InterruptedException 
	{
		driver.get(facebookUrl);
		ReusableMethods rub = new ReusableMethods(driver);
		FacebookHomePageObject mouseHover = new FacebookHomePageObject(driver);
		rub.pageScrollDown();
		mouseHover.mouseHoverAndRightClickActionOnInstagramLink();
		rub.robotAction();
		Thread.sleep(1000);
		rub.windowHandle();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
