package com.git.cucumberdemo.utils;

public class DriverFactory {
	
	public static DriverClass createInstance() {
		DriverClass driver = new DriverClass();
		return driver.createDriver();		
	}

}
