package com.qaproject.drivers;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public abstract class BaseDriver {
	protected WebDriver driver;

	public abstract WebDriver createDriver();

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToUrl(String url) {
		if (driver != null) {
			driver.get(url);
		}
	}

	public String getCurrentUrl() {
		if (driver != null) {
			return driver.getCurrentUrl();
		}
		return null;
	}

	public void maximizeWindow() {
		if (driver != null) {
			driver.manage().window().maximize();
		}
	}

	public void closeDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

}
