package com.qaproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	// div[@class='ct-profile']

	private static final String AVATARAIMAGE_XPATH = "//div[@class='profile-image-container']";
	private static final String ROFILE_XPATH = "//div[@class='ct-profile']";
	private static final String USERNAME_XPATH = "//div[@class='ct-profile']//h3[@class='ct-user-name ']";

	private static final By AVATARAIMAGE_SELECTOR = By.xpath(AVATARAIMAGE_XPATH);
	private static final By ROFILE_SELECTOR = By.xpath(ROFILE_XPATH);
	private static final By USERNAME_SELECTOR = By.xpath(USERNAME_XPATH);

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}

	@Override
	public boolean isPageLoaded() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(AVATARAIMAGE_SELECTOR));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ROFILE_SELECTOR));
			wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_SELECTOR));

			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	@Override
	public void waitForPageToLoad() {
		wait.until(ExpectedConditions.titleContains("Guru99 Bank Home Page"));
	}

	@Override
	public void verifyPage() {
		if (isPageLoaded()) {
			System.out.println("Home page is loaded successfully.");
		} else {
			System.out.println("Failed to load the Home page.");
		}
	}
	

	public String getTextFromSelector() {
		WebElement element = driver.findElement(USERNAME_SELECTOR);
		return element.getText();
	}


}
