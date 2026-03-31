package testScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listenerUtility.Listener;
import pageObjectClasses_Amazon.AmazonHomePageObject;

@Listeners(Listener.class)
public class Tc003_DynamicSearchAndListDropdown extends BaseTestClass{
	
	@Test
	public void dynamicSearchAndListDropdown_ClickSelect() throws InterruptedException 
	{
		driver.get(amazonUrl);
		
		AmazonHomePageObject dynamicList = new AmazonHomePageObject(driver);
		dynamicList.amazonHomePagesearchBox("shoes");
		dynamicList.dynamicSearchList("men sports");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
