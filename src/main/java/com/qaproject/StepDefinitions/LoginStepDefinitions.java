package com.qaproject.StepDefinitions;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class LoginStepDefinitions extends BaseDefinition {	
	
	
	@Given("I am on the login page of application")
	public void navigateToLoginPage() {
		 
		driver.get(appConfig.getUrl());
		 System.out.println("Browser has been lunch and user is on login page");
	}

	@When("I enter {string} and {string} credentials")
	public void enterCredentials(String enteredUsername, String enteredPassword) {
		
		loginPage.enterUsername(enteredUsername);
		loginPage.enterPassword(enteredPassword);
		System.out.println(String.format("I enter %s and %s credentials", enteredUsername, enteredPassword));

	}

	@Then("User is {string} to login application")
	public void verifyLoginStatus(String expectedStatus) {
		loginPage.clickLoginButton();
		String loginPageTitle=loginPage.getPageTitle();
		System.out.println("----------------------------------------------");
		System.out.println(loginPageTitle.toString());
		System.out.println(loginPage.verifyUseIsOnDashboard());
		
		//Assert.assertEquals(expectedStatus, loginStatus);
	}

}
