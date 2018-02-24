package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pom.config.OR;

public class Kartdetailpage {

	@FindBy(xpath=OR.productx)
	public WebElement productx;
	
	@FindBy(xpath=OR.removeitemx)
	public WebElement removeitemx;
}
