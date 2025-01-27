package com.erhan.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.erhan.utils.US_01_Constants;
import com.erhan.utils.US_02_ConfigsReader;



public class US_01_BaseClass {


	public static WebDriver driver;

	public static void setUp() {

		US_02_ConfigsReader.readProperties(US_01_Constants.CONFIGURATION_FILEPATH);

		String browser = US_02_ConfigsReader.getProperty("browser");

		switch (browser.toLowerCase()) {
		
		case "chrome":
			
			driver = new ChromeDriver();
			break;

		case "firefox":
			
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			
			driver = new SafariDriver();
			break;

		default:
			break;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(US_01_Constants.IMPLICIT_WAIT_TIME));
		
		driver.manage().window().maximize();
		
		String website = US_02_ConfigsReader.getProperty("url");
		driver.get(website);

		US_02_PageInitializer.initialize();
	}
	
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}


}
