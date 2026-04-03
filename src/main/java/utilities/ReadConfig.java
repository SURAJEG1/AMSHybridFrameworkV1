package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	//Create object of Properties class
	Properties properties;
	String filePath = "E:\\InfoEge Automation Project\\AMSHybridFrameworkV1\\src\\main\\java\\resourceProperties\\config.properties";
	
	//Constructor
	public ReadConfig() 
	{
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(filePath);
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//create methods for browser and url key
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not spacified in config.properties file");
	}
	
	
	public String getAmazonUrl() 
	{
		String value = properties.getProperty("amazonUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("amazonUrl is not spacified in config.properties file");
	}
	
	
	public String getHRMSUrl() 
	{
		String value = properties.getProperty("hrmsUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("hrmsUrl is not spacified in config.properties file");
	}
	
	
	
	public String getFacebookUrl() 
	{
		String value = properties.getProperty("facebookUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("facebookUrl is not spacified in config.properties file");
	}
	
	
	
	public String  getZometoUrl() 
	{
		String value = properties.getProperty("zometoUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("zpmetoUrl is not spacified in config.properties file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
