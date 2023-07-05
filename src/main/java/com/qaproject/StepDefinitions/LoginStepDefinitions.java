package com.qaproject.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class LoginStepDefinitions extends BaseDefinition {	
	
	
	@Given("I am on the login page of application")
	public void navigateToLoginPage() {
		 
		loginPage.waitForPageToLoad();
		loginPage.isPageLoaded();
		 System.out.println("User is on login page");
	}

	@When("I enter {string} and {string} credentials")
	public void enterCredentials(String enteredUsername, String enteredPassword) {
		
		loginPage.enterUsername(enteredUsername);
		loginPage.enterPassword(enteredPassword);
		System.out.println(String.format("user enter %s and %s credentials", enteredUsername, enteredPassword));

	}

	@Then("User is {string} to login application")
	public void verifyLoginStatus(String expectedStatus) {
		loginPage.clickLoginButton();
		System.out.println("User click on login button");
		/*
		 * String loginPageTitle=loginPage.getPageTitle();
		 * System.out.println("----------------------------------------------");
		 * System.out.println(loginPageTitle.toString());
		 * //System.out.println(loginPage.verifyUseIsOnDashboard());
		 */		
		//Assert.assertEquals(expectedStatus, loginStatus);
	}

}
