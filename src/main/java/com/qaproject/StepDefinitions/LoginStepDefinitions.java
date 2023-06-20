package com.qaproject.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class LoginStepDefinitions {	
	
	
	@Given("I am on the login page of application")
	public void navigateToLoginPage() {
		 System.out.println("I am on the login page of application-------------------------");
	}

	@When("I enter {string} and {string} credentials")
	public void enterCredentials(String enterSedUsername, String enteredPassword) {
		 System.out.println("I enter {string} and {string} credentials---------------------------");
	}

	@Then("User is {string} to login application")
	public void verifyLoginStatus(String expectedStatus) {
		 System.out.println("User is {string} to login application----------------------------");
		//Assert.assertEquals(expectedStatus, loginStatus);
	}

}
