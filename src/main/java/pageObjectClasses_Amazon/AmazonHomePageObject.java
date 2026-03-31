package pageObjectClasses_Amazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageObject {
	WebDriver driver;
	
	//constructor
	public AmazonHomePageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (id = "twotabsearchtextbox") WebElement searchBox;
	@FindBy (xpath = "//span[@class='s-heavy']") List<WebElement> dynamicList;
	
	
	public void amazonHomePagesearchBox(String item) 
	{
		searchBox.sendKeys(item);
	}
	
	
	public void dynamicSearchList(String contains) throws InterruptedException 
	{
		System.out.println(dynamicList.size());
		Thread.sleep(1000);
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			if(dynamicList.get(i).getText().contains(contains)) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
