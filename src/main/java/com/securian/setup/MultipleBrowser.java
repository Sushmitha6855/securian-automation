package com.securian.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {
	
	/**
	 * This method is used initialize WebDriver instance on the specified Browser
	 * 
	 * @param browser
	 * @return
	 */
	public WebDriver initializeBrowser(String browser) {
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = (WebDriver) new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		return driver;
	}

}
