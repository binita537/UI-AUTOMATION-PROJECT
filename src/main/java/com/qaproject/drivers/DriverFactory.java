package com.qaproject.drivers;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qaproject.config.AppConfig;
import com.qaproject.config.BrowserConfig;

@Component
public class DriverFactory {

	private WebDriver driver;
	private BaseDriver baseDriverInstance;

	
	@Autowired
	private BrowserConfig browserConfig;
	
	@Autowired
	private AppConfig appConfig;

	public void someMethod() {
        System.out.println(appConfig.getUrl());
	    System.out.println( appConfig.getUsername());
	    System.out.println(appConfig.getPassword());
	    }
	
	public void someMethod1() {
	    System.out.println(browserConfig.getName());
	    System.out.println(browserConfig.getVersion());
	  }

	public WebDriver getBrowser() {

		if (browserConfig.getName().equalsIgnoreCase(BrowserType.CHROME.getValue())) {
			baseDriverInstance = new ChromeDriverInstance();
		} else if (browserConfig.getName().equalsIgnoreCase(BrowserType.FIREFOX.getValue())) {
			baseDriverInstance = new FirefoxDriverInstance();
		} else if (browserConfig.getName().equalsIgnoreCase(BrowserType.IE.getValue())) {
			baseDriverInstance = new IEDriverInstance();
		} else {
			throw new IllegalArgumentException("Invalid browser type: " + browserConfig.getName());

		}

		driver = baseDriverInstance.createDriver();

		return driver;
	}

	public void launchUrl() {
		if (driver == null) {
			throw new IllegalStateException("WebDriver instance is not initialized.");
		}

		driver.get(appConfig.getUrl());
	}

}
