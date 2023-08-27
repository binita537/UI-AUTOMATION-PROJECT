package com.qaproject.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.qaproject.UiAutomationApplication;
import com.qaproject.config.AppConfig;
import com.qaproject.config.BrowserConfig;
import com.qaproject.drivers.BaseDriver;
import com.qaproject.drivers.DriverFactory;
import com.qaproject.pages.LoginPage;
import com.qaproject.pages.RegisterPage;
import com.qaproject.utils.CommonUtils;

import io.cucumber.spring.CucumberContextConfiguration;


@CucumberContextConfiguration
@SpringBootTest(classes = UiAutomationApplication.class)
public class BaseDefinition {
	
	@Autowired
	 DriverFactory driverFactory;

	@Autowired
	 BaseDriver baseDriver;

	@Autowired
	 WebDriver driver;

	@Autowired
	BrowserConfig browserConfig;

	@Autowired
	AppConfig appConfig;

	@Autowired
	CommonUtils commonUtils;
	
	@Autowired
	LoginPage loginPage ;
	
	@Autowired
	WebDriverWait webDriverWait;
	
	@Autowired
	RegisterPage registerPage;

}
