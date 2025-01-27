package com.erhan.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erhan.testbase.US_01_BaseClass;
import com.erhan.utils.US_03_CommonMethods;

public class US_02_SignUp_PE extends US_03_CommonMethods {
	
	@FindBy(id = "")
	public WebElement firstname;
	
	@FindBy(xpath = "")
	public WebElement lastname;
	
	@FindBy(xpath = "")
	public WebElement email;
	
	@FindBy(xpath = "")
	public WebElement retypeemail;
	
	@FindBy(xpath = "")
	public WebElement password;
	
	@FindBy(xpath = "")
	public WebElement retypepassword;
	
	@FindBy(xpath = "")
	public List <WebElement> headers;
	
	
	public US_02_SignUp_PE () 
	{
		PageFactory.initElements(driver, this);
	}

}
