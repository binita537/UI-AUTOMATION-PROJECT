package com.qaproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @Value("${page.wait.duration.seconds:10}")
    private int waitDuration;

    @Autowired
    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, waitDuration);
    }

    public abstract boolean isPageLoaded();

    public abstract void waitForPageToLoad();

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPageURL() {
        return driver.getCurrentUrl();
    }

    public abstract void verifyPage();
}
