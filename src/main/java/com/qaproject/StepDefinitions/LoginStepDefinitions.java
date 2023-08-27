package com.qaproject.StepDefinitions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginStepDefinitions extends BaseDefinition {
	
	
	 static final Logger logger = LoggerFactory.getLogger(LoginStepDefinitions.class);

	@Given("I am on the login page of application")
	public void navigateToLoginPage() {

		loginPage.waitForPageToLoad();
		loginPage.isPageLoaded();
		
		logger.info("----------------------I am going to login page");
	}

	@When("I enter {string} and {string} credentials")
	public void enterCredentials(String enteredUsername, String enteredPassword) {

		loginPage.enterUsername(enteredUsername);
		loginPage.enterPassword(enteredPassword);
		logger.info("-----------------------I have entered the username and password in to application");
	}

	@Then("User is {string} to login application")
	public void verifyLoginStatus(String expectedStatus) {
		loginPage.clickLoginButton();
		/*
		 * String loginPageTitle=loginPage.getPageTitle();
		 * System.out.println("----------------------------------------------");
		 * System.out.println(loginPageTitle.toString());
		 * //System.out.println(loginPage.verifyUseIsOnDashboard());
		 */
		// Assert.assertEquals(expectedStatus, loginStatus);
		logger.info("-----------------------I have entered the username and password in to application");
	}

}
