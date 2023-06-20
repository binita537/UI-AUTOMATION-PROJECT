package com.qaproject.drivers;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;



public abstract class BaseDriver {
	protected WebDriver driver;

    public abstract WebDriver createDriver();

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}
