package com.qaproject.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverInstance extends BaseDriver{

	 @Override
	    public WebDriver createDriver() {
	        System.out.println("This is my chrome driver");
	        WebDriverManager.firefoxdriver().setup();
	        FirefoxOptions firefoxOptions = new FirefoxOptions();
	        setCapabilitiesForFirefoxDriver (firefoxOptions); // Call the method to set capabilities
	        return new FirefoxDriver(firefoxOptions);
	    }

	    public void setCapabilitiesForFirefoxDriver (FirefoxOptions options) {
	        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	        capabilities.setCapability("browserName", "firefox");
	        capabilities.setCapability("version", "latest");
	        capabilities.setCapability("platform", "WINDOWS");
	        capabilities.setAcceptInsecureCerts(true);
	        capabilities.setCapability("build", "UiAutomationTest");
	        capabilities.setCapability("name", "UiAutomationTest");
	        capabilities.setCapability("network", true); // To enable network logs
	        capabilities.setCapability("visual", true); // To enable step by step screenshot
	        capabilities.setCapability("video", true); // To enable video recording
	        capabilities.setCapability("console", true); // To capture console logs
	        options.addArguments("--start-maximized");
	        options.addArguments("--disable-infobars");
	        options.addArguments("--disable-extensions");
	        options.merge(capabilities);
	    }

}
