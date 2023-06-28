package com.qaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.qaproject.config.AppConfig;
import com.qaproject.config.BrowserConfig;
import com.qaproject.config.WebDriverConfig;
import com.qaproject.drivers.DriverFactory;
@SpringBootApplication
@EnableConfigurationProperties({AppConfig.class, BrowserConfig.class})
public class UiAutomationApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext=	SpringApplication.run(UiAutomationApplication.class, args);
	DriverFactory DF=applicationContext.getBean(DriverFactory.class);
	
	DF.someMethod();
	DF.someMethod1();
	/*
	 * DF.getBrowser(); DF.launchUrl();
	 */
	
	}

}
