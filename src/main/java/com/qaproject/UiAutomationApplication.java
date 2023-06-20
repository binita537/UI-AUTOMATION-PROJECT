package com.qaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qaproject.drivers.ChromeDriverInstance;
@SpringBootApplication
public class UiAutomationApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext=	SpringApplication.run(UiAutomationApplication.class, args);
	 
	}

}
