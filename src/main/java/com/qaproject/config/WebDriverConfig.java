package com.qaproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.qaproject.drivers.DriverFactory;


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

}
