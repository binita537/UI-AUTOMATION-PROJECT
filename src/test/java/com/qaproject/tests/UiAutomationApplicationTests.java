package com.qaproject.tests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.qaproject.drivers.DriverFactory;



@SpringBootTest   //Its gonna scan all tha component ,sitting anywhere
class UiAutomationApplicationTests {

	
	@Autowired
	DriverFactory driverFactory;

	@Value("${browser.name}")
	private String browserName;
	
	
	@Test
	void contextLoads() {
		
		driverFactory.getBrowser();
		 driverFactory.launchUrl();
		
	}

}
