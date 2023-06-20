package com.qaproject.StepDefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import com.qaproject.pages.LoginPage;

@
public class BaseDefinition {
	
	@Autowired
	public LoginPage loginPage;

}
