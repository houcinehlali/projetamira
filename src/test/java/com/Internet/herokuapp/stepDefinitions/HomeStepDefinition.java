package com.Internet.herokuapp.stepDefinitions;

import java.util.List;

import org.junit.Assert;

import com.Internet.herokuapp.pages.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinition {

	HomePage home;

	@Then("^the sub-header text is \"([^\"]*)\"$")
	public void the_subheader_text_is_something(String expectedSubHeaderText) throws Throwable {

		home = new HomePage();

		String actualResult = home.getSubHeaderText();

		Assert.assertEquals(expectedSubHeaderText, actualResult);

	}

	@Then("^a list of the following sub-pages is displayed$")
	public void a_list_of_the_following_subpages_is_displayed(DataTable dt) throws Throwable {

		home = new HomePage();

		List<String> expectedListOfSubPageContent = dt.asList();

		List<String> actualListOfSubPageContent = home.getSubPagesNames();

		Assert.assertEquals(expectedListOfSubPageContent, actualListOfSubPageContent);

	}
	
	
	 @When("^I click on the \"([^\"]*)\" link$")
	    public void i_click_on_the_page_link(String pagelink) throws Throwable {
		 
		 
			home = new HomePage();
			
			home.clickOnPageLink(pagelink);
		 
	    }


}
