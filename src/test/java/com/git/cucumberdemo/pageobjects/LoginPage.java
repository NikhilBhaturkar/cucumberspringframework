package com.git.cucumberdemo.pageobjects;

import com.git.cucumberdemo.utils.DriverInitializer;

public class LoginPage extends DriverInitializer{
	
	public void navigate() {
		getDriver().navigate().to("http://google.com");
	}

	public void quitMyBrowser() {
		quitBrowser();
	}
	
}
