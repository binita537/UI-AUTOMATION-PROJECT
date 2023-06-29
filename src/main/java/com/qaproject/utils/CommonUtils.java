package com.qaproject.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;


public class CommonUtils {


	public void destroyDriver(WebDriver driver) {
		if (driver != null) {
			driver.quit();
		}
	}

	public void takeScreenshot(WebDriver driver, String fileName) {
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
			String screenshotName = fileName + "_" + timestamp + ".png";
			Path destinationPath = Files.createTempFile("screenshots", screenshotName);
			Files.copy(screenshotFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Screenshot saved: " + destinationPath);
		} catch (IOException e) {
			System.err.println("Failed to save screenshot: " + e.getMessage());
		}
		
		System.out.println("This is my methos in utils class ");
	}

}
