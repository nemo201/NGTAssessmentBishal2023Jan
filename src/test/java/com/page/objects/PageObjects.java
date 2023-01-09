package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	public static WebDriver driver;
	public static String productName;
	
	public PageObjects(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}
	
	@FindBy(id = "mobileNumberPass")
	public static WebElement emailField;
	
	@FindBy(xpath = "//input[@class='form-control has-feedback']")
	public static WebElement passwordField;

}
