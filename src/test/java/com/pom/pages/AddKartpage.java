package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pom.config.OR;

public class AddKartpage {

	@FindBy(xpath=OR.addtobaskx)
	public WebElement addtobaskx;
	
	@FindBy(xpath=OR.viewbaslx)
	public WebElement viewbaslx;
	
}
