package com.securian.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.securian.setup.Base;
import com.securian.setup.MultipleBrowser;

public class BaseTest extends Base{

	public static WebDriver driver;
	MultipleBrowser multipleBrowser; 
	
	@BeforeSuite
	public void initialize() {
		multipleBrowser = new MultipleBrowser();
		setEnvironmentConfig();
		driver = multipleBrowser.initializeBrowser(getBrowser());
	}
	
	@AfterSuite
	public void close() {
		driver.close();
		driver.quit();
	}
}