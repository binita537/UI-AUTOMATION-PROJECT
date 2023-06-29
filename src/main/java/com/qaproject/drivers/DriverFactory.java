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

	public WebDriver getWebDriverInstance(BaseDriver baseDriver) {
		driver = baseDriver.createDriver();
		System.out.println("I have given web driver instance");
		return driver;
	}


	public BaseDriver initializeBaseDriverInstance() {

		if (browserConfig.getName().equalsIgnoreCase(BrowserType.CHROME.getValue())) {
			baseDriverInstance = new ChromeDriverInstance();
		} else if (browserConfig.getName().equalsIgnoreCase(BrowserType.FIREFOX.getValue())) {
			baseDriverInstance = new FirefoxDriverInstance();
		} else if (browserConfig.getName().equalsIgnoreCase(BrowserType.IE.getValue())) {
			baseDriverInstance = new IEDriverInstance();
		} else {
			throw new IllegalArgumentException("Invalid browser type: " + browserConfig.getName());

		}

		System.out.println("I have given Base driver instance");
		return baseDriverInstance;
	}

// Need to write in Step defination
	public void launchUrl() {
		if (driver == null) {
			throw new IllegalStateException("WebDriver instance is not initialized.");
		}

		driver.get(appConfig.getUrl());
	}

}
