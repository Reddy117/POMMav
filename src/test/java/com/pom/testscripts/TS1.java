package com.pom.testscripts;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.pages.AddKartpage;
import com.pom.pages.Kartdetailpage;
import com.pom.pages.Landingpage;
import com.pom.util.BaseClass;

public class TS1 extends BaseClass{

	@BeforeMethod
	public void openapp() throws IOException{
		openBrowser("firefox", readproperty("url"));
	}
	
	//@Test
	public void addrubytokartandverify(){
		Landingpage lp=PageFactory.initElements(driver, Landingpage.class);
		AddKartpage ap=PageFactory.initElements(driver,AddKartpage.class);
		Kartdetailpage kp=PageFactory.initElements(driver,Kartdetailpage.class);
		
		lp.rubyx.click();
		ap.addtobaskx.click();
		ap.viewbaslx.click();
		String act=kp.productx.getText();
		Assert.assertEquals(act, "Selenium Ruby");
	}
	
	@Test
	public void removeitem(){
		Landingpage lp=PageFactory.initElements(driver, Landingpage.class);
		AddKartpage ap=PageFactory.initElements(driver,AddKartpage.class);
		Kartdetailpage kp=PageFactory.initElements(driver,Kartdetailpage.class);
		
		lp.rubyx.click();
		ap.addtobaskx.click();
		ap.viewbaslx.click();
		kp.removeitemx.click();
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
