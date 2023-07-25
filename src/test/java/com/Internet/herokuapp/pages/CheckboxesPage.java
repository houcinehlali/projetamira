package com.Internet.herokuapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage extends BasePage {

	@FindBy(tagName = "h3")

	WebElement pageTitle;

	public CheckboxesPage() {
	    
		
		PageFactory.initElements(driver, this);
		
	}

	@Override
	public String getPageTitleText() {
		// TODO Auto-generated method stub
		return pageTitle.getText();
	}

}
