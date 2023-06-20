package com.qaproject.drivers;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DriverFactory {


	private WebDriver driver;
	
	@Value("${app.url}")
	private String appUrl;
	
	@Value("${browser.name}")
	private String browserName;
	
	
	private BaseDriver baseDriverInstance;

	public WebDriver getBrowser() {

		if (browserName.equalsIgnoreCase(BrowserType.CHROME.getValue())) {
			baseDriverInstance = new ChromeDriverInstance();
		} else if (browserName.equalsIgnoreCase(BrowserType.FIREFOX.getValue())) {
			baseDriverInstance = new FirefoxDriverInstance();
		} else if (browserName.equalsIgnoreCase(BrowserType.IE.getValue())) {
			baseDriverInstance = new IEDriverInstance();
		} else {
			throw new IllegalArgumentException("Invalid browser type: " + browserName);

		}
		
		 driver = baseDriverInstance.createDriver();


		return driver;
	}
	
	  public void launchUrl() {
	        if (driver == null) {
	            throw new IllegalStateException("WebDriver instance is not initialized.");
	        }

	        driver.get(appUrl);
	    }

	
	

}
