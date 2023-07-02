package com.qaproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qaproject.utils.ElementAction;

@Component
public class LoginPage extends BasePage {
	
	
	
	@Autowired
	ElementAction elementAction;

	private static final String LOGIN_USERNAME_XPATH = "//input[@name='username']";
	private static final String LOGIN_PASSWORD_XPATH = " //input[@name='password']";
	private static final String LOGIN_BUTTON_XPATH = "//button[@type='submit']";  
	private static final String LOGO_IMAGE_XPATH = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']";//"//div[@class='ct-logo-header']";
	private static final String FORGOT_PASSWORD_XPATH ="//a[text()='Forgot Password']"; 
	
	

	private static final By LOGIN_USERNAME_SELECTOR = By.xpath(LOGIN_USERNAME_XPATH);
	private static final By LOGIN_PASSWORD_SELECTOR = By.xpath(LOGIN_PASSWORD_XPATH);
	private static final By LOGIN_BUTTON_SELECTOR = By.xpath(LOGIN_BUTTON_XPATH);
	private static final By LOGO_IMAGE_SELECTOR = By.xpath(LOGO_IMAGE_XPATH);
	private static final By FORGOT_PASSWORD_SELECTOR = By.xpath(FORGOT_PASSWORD_XPATH);
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	@Override
	public boolean isPageLoaded() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_USERNAME_SELECTOR));
			wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_PASSWORD_SELECTOR));
			wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON_SELECTOR));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	@Override
	public void waitForPageToLoad() {
		wait.until(ExpectedConditions.titleContains("ExecuteAutomation"));
	}

	@Override
	public void verifyPage() {
		if (isPageLoaded()) {
			System.out.println("Login page is loaded successfully.");
		} else {
			System.out.println("Failed to load the login page.");
		}
	}
	
	public boolean isLogoDisplayed() {
        WebElement logoImage = driver.findElement(LOGO_IMAGE_SELECTOR);
        return logoImage.isDisplayed();
    }

	public void enterUsername(String username) {
		
		elementAction.waitUntilElementClickable(driver, LOGIN_USERNAME_SELECTOR);
		WebElement usernameInput = driver.findElement(LOGIN_USERNAME_SELECTOR);
		usernameInput.clear();
		usernameInput.sendKeys(username);
	}

	public void enterPassword(String password) {
		elementAction.waitUntilElementClickable(driver, LOGIN_PASSWORD_SELECTOR);
		WebElement passwordInput = driver.findElement(LOGIN_PASSWORD_SELECTOR);
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}

	public HomePage clickLoginButton() {
		WebElement loginButton = driver.findElement(LOGIN_BUTTON_SELECTOR);
		loginButton.click();
		 return new HomePage(driver, wait);
	}

	public HomePage login(String username, String password) {
	    enterUsername(username);
	    enterPassword(password);
	    clickLoginButton();
	    return new HomePage(driver, wait);
	}
	
	public String verifyUseIsOnDashboard()
	{
		 String dashboardText = driver.getCurrentUrl();
	        return dashboardText;
	}
	


}