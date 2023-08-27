package com.qaproject.StepDefinitions;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hooks extends BaseDefinition {

	private static final Logger logger = LoggerFactory.getLogger(Hooks.class);

	@Before
	public void setup(Scenario scenario) {
		MDC.put("testName", scenario.getName());
		MDC.put("testDate",scenario.getId()+""+LocalDate.now());
		logger.info("Browser is getting ready fot scenario :----" + scenario.getName()+"------------");
		if (driver == null) {			
			baseDriver = driverFactory.initializeBaseDriverInstance();
			driver = baseDriver.createDriver();
		}
		driver.get(appConfig.getUrl());

	}

	@After
	public void teardown(Scenario scenario) {
		
		if (driver != null) {
			driver.quit();
		}
		
		logger.info("Scenario is done,Lets close the browser:-----" + scenario.getName()+"----------");
		MDC.remove("testName"); 
		
	}

}