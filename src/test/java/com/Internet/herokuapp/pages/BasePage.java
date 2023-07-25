package com.Internet.herokuapp.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

	public static WebDriver driver;

	public static String BASE_URL = "https://the-internet.herokuapp.com";

	public static Map<String, String> PAGE_URL = new HashMap<String, String>();

	static {

		PAGE_URL.put("home", BASE_URL + "/");
		PAGE_URL.put("checkboxes", BASE_URL + "/checkboxes");
		PAGE_URL.put("dropdown", BASE_URL + "/dropdown");

	}

	@FindBy(xpath = "//a[contains(text(),'Elemental Selenium')]")
	WebElement footerContent;

	public BasePage() {

		PageFactory.initElements(driver, this);

	}

	public String getPageFtooterText() {

		return footerContent.getText();

	}

	public abstract String getPageTitleText();

//	public String getPageTitleText() {
//		
//		return pageTitle.getText();
//		
//	}

}
