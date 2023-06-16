package com.qaproject.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/resources/features/LoginTest.feature",
    glue = "com.qaproject.StepDefinitions",
    plugin = {
        "pretty",
        "json:target/cucumber.json",
        "html:target/report",
        "junit:target/junit.xml"
    },
    tags = "@loginapp"
)
public class ITSuiteRunner {

}
