package com.git.cucumberdemo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverClass {
	public WebDriver driver;
	private final String CHROME_WEBDRIVER_LOCATION = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\drivers\\chromedriver.exe";
	private final String IE_WEBDRIVER_LOCATION = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\drivers\\IEWebdriver.exe";
	private final String FIREFOX_WEBDRIVER_LOCATION = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\drivers\\firefoxdriver.exe";
	private String driverName = "CHROME";

	public DriverClass createDriver() {
		if (driver == null) {
			switch (driverName.toUpperCase()) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", CHROME_WEBDRIVER_LOCATION);
				driver = new ChromeDriver();
				break;
			case "IE":
				System.setProperty("webdriver.ie.driver", IE_WEBDRIVER_LOCATION);
				driver = new InternetExplorerDriver();
				break;
			case "FIREFOX":
				System.setProperty("webdriver.firefox.driver", FIREFOX_WEBDRIVER_LOCATION);
				driver = new FirefoxDriver();
				break;
			default:
				System.setProperty("webdriver.ie.driver", IE_WEBDRIVER_LOCATION);
				driver = new ChromeDriver();
				break;
			}
		}
		driver.navigate().to("http://google.com");
		return this;

	}

}
