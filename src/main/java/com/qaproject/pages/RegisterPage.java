package com.qaproject.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RegisterPage extends BasePage {
	
	
	//a[text()='here']/@href	
	private static final String REGISTER_XPATH = "//a[text()='here']";
	private static final String ACCESS_DETAIL_XPATH = "//table//tbody//tr[1]//td[1]//h2[text()='Access details to demo site.']";
	private static final String EMAILID_XPATH = "//input[@name='emailid']";
	private static final String SUBMIT_BUTTON_XPATH = "//input[@type='submit']";
	private static final String USERID_XPATH="//table//tbody//tr[4]//td[text()='User ID :']/following-sibling::td";
	private static final String PASSWORD_XPATH = "//table//tbody//tr[5]//td[text()='Password :']/following-sibling::td"; 
	private static final String ADVERTISEMENT_XPATH ="//iframe[@title='Advertisement' and @id='ad_iframe']";
	private static final String ADVERTISEMENT_CLOSE_BUTTON_XPATH ="//div[@id='dismiss-button']"; 
	

	private static final By REGISTER_SELECTOR = By.xpath(REGISTER_XPATH);
	private static final By ACCESS_DETAIL_SELECTOR = By.xpath(ACCESS_DETAIL_XPATH);
	private static final By EMAILID_SELECTOR= By.xpath(EMAILID_XPATH);
	private static final By SUBMIT_BUTTON_SELECTOR = By.xpath(SUBMIT_BUTTON_XPATH);
	private static final By USERID_SELECTOR = By.xpath(USERID_XPATH);
	private static final By PASSWORD_SELECTOR = By.xpath(PASSWORD_XPATH);
	private static final By ADVERTISEMENT_SELECTOR = By.xpath(ADVERTISEMENT_XPATH);
	private static final By ADVERTISEMENT_CLOSE_BUTTON_SELECTOR = By.xpath(ADVERTISEMENT_CLOSE_BUTTON_XPATH);
	
	
	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isPageLoaded() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(ACCESS_DETAIL_SELECTOR));
			wait.until(ExpectedConditions.visibilityOfElementLocated(REGISTER_SELECTOR));
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
			System.out.println("Register page is loaded successfully.");
		} else {
			System.out.println("Failed to load the Register page.");
		}
	}

	 public void clickRegister() {
		 elementAction.waitUntilElementClickable(driver, REGISTER_SELECTOR);
		 WebElement registerLink = driver.findElement(REGISTER_SELECTOR);
		 registerLink.click();
	    }

	   
	    public void enterEmailId(String email) {
	    	 elementAction.waitUntilElementClickable(driver, EMAILID_SELECTOR);
			 WebElement emailInput = driver.findElement(EMAILID_SELECTOR);
			 emailInput.clear();
			 emailInput.sendKeys(email);
			 }

	    public void clickSubmitButton() {
	    	 elementAction.waitUntilElementClickable(driver, SUBMIT_BUTTON_SELECTOR);
			 WebElement submitButton = driver.findElement(SUBMIT_BUTTON_SELECTOR);
			 submitButton.click();
	    }

	    public String getUserId() {
	    	elementAction.waitUntilElementPresent(driver, USERID_SELECTOR);
			 WebElement userId = driver.findElement(USERID_SELECTOR);
			// System.out.println(userId.getText());
			return userId.getText();
	    }

	    public String getPassword() {
	    	elementAction.waitUntilElementPresent(driver, PASSWORD_SELECTOR);
			 WebElement password = driver.findElement(PASSWORD_SELECTOR);
			// System.out.println(password.getText());
			return password.getText();
	    }
	    
	    public boolean isAdvertisementPresent()
	    {
	    	return elementAction.isElementPresent(driver);
	    }
	    
	    public void closeAdvertisement()
		{
			/*
			 * 
			 * 
			 * // Check if current window is an iframe if
			 * (!driver.findElements(By.tagName("iframe")).isEmpty()) { for (WebElement
			 * iframe : driver.findElements(By.tagName("iframe"))) {
			 * driver.switchTo().frame(iframe).close();
			 * 
			 * driver.switchTo().defaultContent(); } }
			 * 
			 * // Check if an alert is present WebDriverWait wait = new
			 * WebDriverWait(driver, 10); if
			 * (wait.until(ExpectedConditions.alertIsPresent()) != null) { Alert alert =
			 * driver.switchTo().alert(); // Handle the alert (accept, dismiss, etc.) // ...
			 * alert.dismiss(); }
			 */}}
