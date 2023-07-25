package com.Internet.herokuapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage extends BasePage {

	@FindBy(tagName = "h3")

	WebElement pageTitle;

	public DropDownPage() {
	    
		
		PageFactory.initElements(driver, this);
		
	}

	@Override
	public String getPageTitleText() {
		// TODO Auto-generated method stub
		return pageTitle.getText();
	}

}
