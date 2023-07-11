package com.qaproject.StepDefinitions;
import org.springframework.boot.test.context.SpringBootTest;

import com.qaproject.UiAutomationApplication;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = UiAutomationApplication.class)
public class Hooks extends BaseDefinition{


	@Before
	public void setup() {
		if(driver==null)
		{
			baseDriver=driverFactory.initializeBaseDriverInstance();
			driver= baseDriver.createDriver();
			
		}
		driver.get(appConfig.getUrl());
		
		
	}
	

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

}