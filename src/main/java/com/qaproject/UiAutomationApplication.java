package com.qaproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.qaproject.StepDefinitions.Hooks;
import com.qaproject.config.AppConfig;
import com.qaproject.config.BrowserConfig;

@SpringBootApplication
@EnableConfigurationProperties({ AppConfig.class, BrowserConfig.class })
public class UiAutomationApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(Hooks.class);


	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(UiAutomationApplication.class, args);
		logger.info("My application going to start");

	}

}
