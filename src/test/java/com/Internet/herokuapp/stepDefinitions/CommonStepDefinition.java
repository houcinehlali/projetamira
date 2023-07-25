package com.Internet.herokuapp.stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Internet.herokuapp.helper.runner.Config;
import com.Internet.herokuapp.pages.BasePage;
import com.Internet.herokuapp.pages.DropDownPage;
import com.Internet.herokuapp.pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStepDefinition {

	@Before

	public void init() {

		Config.confDriver();
		
		 // Set Chrome to run in headless mode
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.setBinary("C:\\Users\\benah\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");

		BasePage.driver = new ChromeDriver(chromeOptions);

		Config.maximise();
	}

	@Given("^I have navigated to the 'the-internet' \"([^\"]*)\" page$")
	public void i_have_navigated_to_the_theinternet_page(String pageName) throws Throwable {

		Config.page = pageName;

		String url = BasePage.PAGE_URL.get(pageName);

		BasePage.driver.get(url);

	}

	@Then("^the page title is \"([^\"]*)\"$")
	public void the_page_title_is_something(String expectedPageTitleText) throws Throwable {

		String actualText = Config.getPage().getPageTitleText();

		Assert.assertEquals(expectedPageTitleText, actualText);

	}

	@Then("^the \"([^\"]*)\" page opens$")
	public void the_something_page_opens(String pageName) throws Throwable {

		String expectedUrl = BasePage.PAGE_URL.get(pageName.toLowerCase());

		String actualURL = BasePage.driver.getCurrentUrl();

		Assert.assertEquals(expectedUrl, actualURL);

	}

	

	public void tearDown(Scenario scenario) throws IOException {

		if (scenario.isFailed()) {

			File screenShotSource = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.FILE);

			File screenshotDestination = new File("C:\\Screenshot\\failedTC.png");

			FileUtils.copyFile(screenShotSource, screenshotDestination);

		}

		BasePage.driver.quit();

	}

}
