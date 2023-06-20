package com.qaproject.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverInstance extends BaseDriver {

    @Override
    public WebDriver createDriver() {
        System.out.println("This is my chrome driver");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        setCabailitiesforChromeDriver(chromeOptions); // Call the method to set capabilities
        return new ChromeDriver(chromeOptions);
    }

    public void setCabailitiesforChromeDriver(ChromeOptions options) {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("browserName", "chrome");
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
