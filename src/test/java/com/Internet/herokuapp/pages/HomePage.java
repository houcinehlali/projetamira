package com.Internet.herokuapp.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(tagName = "h1")

	WebElement pageTitle;

	@FindBy(xpath = "//*[@id=\"content\"]/ul/li/a")
	List<WebElement> allSubPages;

	@FindBy(tagName = "h2")
	WebElement subHeader;

	public HomePage() {
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver, this);

	}

	@Override
	public String getPageTitleText() {

		return pageTitle.getText();
	}

	public String getSubHeaderText() {

		return subHeader.getText();

	}

	public List<String> getSubPagesNames() {

		List<String> subPageNames = new ArrayList<>();

		for (WebElement subPage : allSubPages) {

			subPageNames.add(subPage.getText());

		}

		return subPageNames;

	}
	
	
	public void clickOnPageLink(String pageName ) {
		
		
		for (WebElement subPage : allSubPages) {

			if (subPage.getText().startsWith(pageName)) {
				
				subPage.click();
				
				break;
				
			}
			
			

		}
		
	}
	

}
