package com.Internet.herokuapp.helper.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Internet.herokuapp.pages.BasePage;
import com.Internet.herokuapp.pages.CheckboxesPage;
import com.Internet.herokuapp.pages.DropDownPage;
import com.Internet.herokuapp.pages.HomePage;

public class Config {
	
	
	public static String page;
	
	public static WebDriver driver;

	public static void confDriver() {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

	}

	public static void attente(long s) {

		BasePage.driver.manage().timeouts().implicitlyWait(s, TimeUnit.SECONDS);

	}

	public static void maximise() {

		BasePage.driver.manage().window().maximize();

	}
	
//	Bonjour je suis Automaticienne de tests logiciels balalalalala
	
	public static BasePage getPage() {

		switch (page) {
		case "home":

			return new HomePage();
		case "dropdown":

			return new DropDownPage();
			
		case "checkboxes":

			return new CheckboxesPage();

		}

		return null;

	}

}
