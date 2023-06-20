package com.qaproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {

	private static final String USERPROFILE_XPATH="//div[@class='profile-image-container']";
	private static final String AVATAR_XPATH = "//div[@class='avatar-selector']//img";   //return list
	private static final String FIRSTNAME_XPATH = "//input[@id='first_name']";
	private static final String LASTNAME_XPATH = "//input[@id='last_name']";
	private static final String COUNTRY_XPATH = "//div[@id='selecteCountry']";
	private static final String EMAIL_PATH = "//input[@id='email']";
	private static final String PASSOWRD_XPATH = "//input[@id='password']";
	private static final String CONFIRMP_PASSWORD_XPATH = "//input[@id='password_confirmation']";
	private static final String PROFESIONAL_XPATH = "//input[@id='designation']";
	private static final String CREATACCOUNT_XPATH = "//button[@type='submit' and text()='Create Account']";

	private static final By USERPROFILE_SELECTOR= By.xpath(USERPROFILE_XPATH);
	private static final By AVATAR_SELECTOR = By.xpath(AVATAR_XPATH);
	private static final By FIRSTNAME_SELECTOR = By.xpath(FIRSTNAME_XPATH);
	private static final By LASTNAME_SELECTOR = By.xpath(LASTNAME_XPATH);
	private static final By COUNTRY_SELECTOR = By.xpath(COUNTRY_XPATH);
	private static final By EMAIL_SELECTOR = By.xpath(EMAIL_PATH);
	private static final By PASSOWRD_SELECTOR = By.xpath(PASSOWRD_XPATH);
	private static final By CONFIRMP_PASSWORD_SELECTOR = By.xpath(CONFIRMP_PASSWORD_XPATH);
	private static final By PROFESIONAL_SELECTOR = By.xpath(PROFESIONAL_XPATH);
	private static final By CREATACCOUNT_SELECTOR = By.xpath(CREATACCOUNT_XPATH);

	
	
	
	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isPageLoaded() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(CREATACCOUNT_SELECTOR));
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

	public void selectAvatar() {
	    WebElement avatar = driver.findElement(AVATAR_SELECTOR);
	    avatar.click();
	}
	
	public void clickUserProfileAndSelectAvatara() {
	    WebElement userProfile = driver.findElement(USERPROFILE_SELECTOR);
	    userProfile.click();
	    selectAvatar();
	}
	public void enterFirstName(String firstName) {
		WebElement firstNameInput = driver.findElement(FIRSTNAME_SELECTOR);
		firstNameInput.clear();
		firstNameInput.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		WebElement lastNameInput = driver.findElement(LASTNAME_SELECTOR);
		lastNameInput.clear();
		lastNameInput.sendKeys(lastName);
	}

	public void selectCountry(String country) {
		WebElement countryInput = driver.findElement(COUNTRY_SELECTOR);
		// Add your implementation here to select the country from the dropdown
	}

	public void enterEmail(String email) {
		WebElement emailInput = driver.findElement(EMAIL_SELECTOR);
		emailInput.clear();
		emailInput.sendKeys(email);
	}

	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(PASSOWRD_SELECTOR);
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		WebElement confirmPasswordInput = driver.findElement(CONFIRMP_PASSWORD_SELECTOR);
		confirmPasswordInput.clear();
		confirmPasswordInput.sendKeys(confirmPassword);
	}

	public void enterProfessional(String professional) {
		WebElement professionalInput = driver.findElement(PROFESIONAL_SELECTOR);
		professionalInput.clear();
		professionalInput.sendKeys(professional);
	}

	public void clickCreateAccountButton() {
		WebElement createAccountButton = driver.findElement(CREATACCOUNT_SELECTOR);
		createAccountButton.click();
	}

	public void createAccount(String firstName, String lastName, String country, String email, String password,
			String confirmPassword, String professional) {
		enterFirstName(firstName);
		enterLastName(lastName);
		selectCountry(country);
		enterPassword(confirmPassword);
		enterConfirmPassword(confirmPassword);
		enterProfessional(professional);
		clickCreateAccountButton();
	}

}
