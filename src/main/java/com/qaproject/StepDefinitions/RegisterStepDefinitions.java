package com.qaproject.StepDefinitions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinitions extends BaseDefinition {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginStepDefinitions.class);
	
	
	@Given("I am on the register page of application")
	public void i_am_on_the_register_page_of_application() {
	   registerPage.clickRegister();
	   
	   registerPage.closeAdvertisement();
	}

	@When("I enter {string} to get userid and password")
	public void i_enter_to_get_userid_and_password(String email) {
	   registerPage.enterEmailId(email);
	   registerPage.clickSubmitButton();
	}

	@Then("User gets userId and Password")
	public void user_gets_user_id_and_password() {
	   registerPage.getUserId(); 
	   System.out.println(registerPage.getUserId());
	   registerPage.getPassword();
	   System.out.println(registerPage.getPassword());
	}
}
