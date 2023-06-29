package com.qaproject.config;

import org.jsoup.Connection.Base;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.qaproject.drivers.BaseDriver;
import com.qaproject.drivers.DriverFactory;
import com.qaproject.utils.CommonUtils;

@Configuration
@ComponentScan("com.qaproject.config")
public class WebDriverConfig {

	@Bean
	public BrowserConfig browserConfig() {
		return new BrowserConfig();
	}

	@Bean
	public AppConfig appConfig() {
		return new AppConfig();
	}

	@Bean
	DriverFactory driverFactory() {
		return new DriverFactory();
	}

	@Bean
	public CommonUtils commonUtils() {
		return new CommonUtils();
	}
	
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
}
