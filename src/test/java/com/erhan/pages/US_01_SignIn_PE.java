package com.erhan.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erhan.testbase.US_01_BaseClass;
import com.erhan.utils.US_03_CommonMethods;

public class US_01_SignIn_PE extends US_03_CommonMethods {
	
	@FindBy(id = "")
	public WebElement username;
	
	@FindBy(xpath = "")
	public WebElement password;
	
	@FindBy(xpath = "")
	public List <WebElement> headers;
	
	
	public US_01_SignIn_PE () 
	{
		PageFactory.initElements(driver, this);
	}
	
}
