package com.qaproject.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qaproject.drivers.BaseDriver;

public class ElementAction {
   
	
	private WebDriver driver;
    private WebDriverWait wait;
    private BaseDriver baseDriver;
    
    

    public ElementAction(WebDriver driver) {
		this.driver = baseDriver.getDriver();
		this.wait = new WebDriverWait(driver, 10);
		
		System.out.println("I have initlise the object");
	}

	public void click(WebDriver driver,WebElement element) {
        element.click();
    }

    public void type(WebDriver driver,WebElement element, String text) {
        element.sendKeys(text);
    }

    public void hoverOver(WebDriver driver,WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

     public void clear(WebDriver driver,WebElement element) {
        element.clear();
    }
     
     public WebElement waitUntilElementVisible(WebDriver driver,By locator, int timeoutInSeconds) {
         return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
     }

     public WebElement waitUntilElementClickable(WebDriver driver,By locator, int timeoutInSeconds) {
         return wait.until(ExpectedConditions.elementToBeClickable(locator));
     }

     public WebElement waitUntilElementPresent(WebDriver driver,By locator, int timeoutInSeconds) {
         return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
     }

     public void waitUntilElementNotVisible(WebDriver driver,By locator, int timeoutInSeconds) {
         wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
     }

     public void waitUntilElementSelected(WebDriver driver,By locator, int timeoutInSeconds) {
         wait.until(ExpectedConditions.elementToBeSelected(locator));
     }
     
     public void waitUntilElementEnabled(WebDriver driver,By locator, int timeoutInSeconds) {
         wait.until(ExpectedConditions.elementToBeClickable(locator));
     }
}
