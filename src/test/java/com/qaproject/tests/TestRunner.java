package com.qaproject.tests;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", 
		glue = "com.qaproject.StepDefinitions", 
		tags = "@logintest",
		plugin = { "pretty", "html:target/cucumber-reports",
				             "json:target/cucumber-reports/cucumber.json" })
public class TestRunner {
	
	


}
