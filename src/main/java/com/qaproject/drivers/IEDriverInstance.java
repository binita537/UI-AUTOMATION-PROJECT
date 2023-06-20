package com.qaproject.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEDriverInstance extends BaseDriver{

	 @Override
	    public WebDriver createDriver() {
	        System.out.println("This is my Internet Explorer driver");
	        WebDriverManager.iedriver().setup();
	        InternetExplorerOptions ieOptions = new InternetExplorerOptions();
	        setCapabilitiesForIEDriver(ieOptions); // Call the method to set capabilities
	        return new InternetExplorerDriver(ieOptions);
	    }

	    public void setCapabilitiesForIEDriver(InternetExplorerOptions options) {
	        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	        capabilities.setCapability("browserName", "internet explorer");
	        capabilities.setCapability("version", "latest");
	        capabilities.setCapability("platform", "WINDOWS");
	        capabilities.setCapability("acceptInsecureCerts", true);
	        capabilities.setCapability("build", "UiAutomationTest");
	        capabilities.setCapability("name", "UiAutomationTest");
	        capabilities.setCapability("network", true); // To enable network logs
	        capabilities.setCapability("visual", true); // To enable step by step screenshot
	        capabilities.setCapability("video", true); // To enable video recording
	        capabilities.setCapability("console", true); // To capture console logs
	        options.merge(capabilities);
	    }

}
