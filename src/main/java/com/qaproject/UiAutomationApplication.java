package com.qaproject;

import org.openqa.selenium.WebDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.qaproject.config.AppConfig;
import com.qaproject.config.BrowserConfig;
import com.qaproject.drivers.DriverFactory;
import com.qaproject.utils.CommonUtils;
@SpringBootApplication
@EnableConfigurationProperties({AppConfig.class, BrowserConfig.class})
public class UiAutomationApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext=	SpringApplication.run(UiAutomationApplication.class, args);
	
	DriverFactory driverFactory=  applicationContext.getBean(DriverFactory.class);
	
	WebDriver driver= (WebDriver) applicationContext.getBean("webDriver");
	System.out.println(driver);
	
	// driverFactory.initializeWebDriverInstance();
	// commonUtils.takeScreenshot(driver, "Binita");
	// BaseDriver baseDriver=   driverFactory.initializeBaseDriverInstance();
	/*
	 * System.out.println(baseDriver); WebDriver driver=
	 * driverFactory.getWebDriverInstance(baseDriver); System.out.println(driver);
	 * commonUtils.takeScreenshot(driver, "Binita");
	 */
	
	CommonUtils commonUtils=applicationContext.getBean(CommonUtils.class);
	commonUtils.takeScreenshot(driver, "Binita");
	
	}

}
