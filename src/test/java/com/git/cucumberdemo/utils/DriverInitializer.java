package com.git.cucumberdemo.utils;

import org.openqa.selenium.WebDriver;

public class DriverInitializer {
	public WebDriver getDriver() {
		if (DriverManager.getDriver() == null) {
			DriverClass driverclass = DriverFactory.createInstance();
			DriverManager.setDriver(driverclass);
		}
		return DriverManager.getDriver().driver;
	}

	public static void quitBrowser() {
		DriverManager.getDriver().driver.quit();
		DriverManager.setDriver(null);
	}
}
