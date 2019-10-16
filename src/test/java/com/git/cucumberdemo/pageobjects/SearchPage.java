package com.git.cucumberdemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.git.cucumberdemo.utils.DriverInitializer;

public class SearchPage extends DriverInitializer{
	
	public void search() {
		getDriver().findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
	}

	public void clickonSearch() {
		getDriver().findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
	}
	public void quitMyBrowser() {
		DriverInitializer.quitBrowser();
	}
}
