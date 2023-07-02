package com.qaproject.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.qaproject.drivers.BaseDriver;
import com.qaproject.drivers.DriverFactory;

@Configuration
@ComponentScan("com.qaproject.config")
public class WebDriverConfig {


	
	@Bean
	BaseDriver baseDriver(DriverFactory driverFactory)
	{
		return driverFactory.initializeBaseDriverInstance();
	}
	
	@Bean
	WebDriver webDriver(DriverFactory driverFactory)
	{
		 BaseDriver baseDriver=  driverFactory.initializeBaseDriverInstance();
		return driverFactory.getWebDriverInstance(baseDriver);
	}
	

	  @Bean
	    public WebDriverWait webDriverWait(WebDriver webDriver) {
	        return new WebDriverWait(webDriver, 10); // Specify the desired timeout value
	    }
	
}
