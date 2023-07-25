package com.Internet.herokuapp.helper.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources",

		glue = "com.Internet.herokuapp.stepDefinitions",


		plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber-html-reports/cucumber.html" }

//		
)

public class Runner {

}
