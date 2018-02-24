package com.pom.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public void openBrowser(String browser,String url){
		if(browser.equals("firefox"))
			driver=new FirefoxDriver();
		else if(browser.equals("chrome")){
			System.setProperty("webdrivr.chrome.driver", "");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
			
	}
	
	public String readproperty(String propertyName) throws IOException{
		FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\pom\\config\\config.properties");
		Properties p=new Properties();
		p.load(f);
		
		return p.getProperty(propertyName);
	}

}
