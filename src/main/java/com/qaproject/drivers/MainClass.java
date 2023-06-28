package com.qaproject.drivers;

import org.openqa.selenium.WebDriver;

public class MainClass {
	WebDriver driver ;

	public static void main(String[] args) {

		MainClass class1Class=new MainClass();
		class1Class.getbrowser();
	}
	
	public void getbrowser()
	{
		
		DriverFactory driverFactory =new DriverFactory();
		driverFactory.getBrowser();
	}
}