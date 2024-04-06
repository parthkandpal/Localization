package com.locale.tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.localization.configutils.ConfigReaderUtil;
import com.localization.driverutils.DriverFactory;
import com.pages.HomePage;

public class HomePageTests {

	DriverFactory df;
	ConfigReaderUtil cr;
	Properties prop;
	HomePage homePage;
	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		cr = new ConfigReaderUtil();
		prop = cr.initializeLanguageProprties("french");
		df = new DriverFactory();
		driver=df.initDriver("edge", prop);
		homePage = new HomePage(driver);
	}
	
	
	@Test
	public void validateHeader() {
		Assert.assertTrue(homePage.ifHeaderExist(prop.getProperty("header")));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
