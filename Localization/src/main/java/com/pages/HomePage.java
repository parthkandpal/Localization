package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.locaization.locatorutils.ElementUtil;

public class HomePage {
	private WebDriver driver;
	private ElementUtil elementUtil;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	private WebElement getHeaderElement(String headerValue) {
		return elementUtil.getElementByXpathText(headerValue);
	}

	public boolean ifHeaderExist(String headerValue) {
		return getHeaderElement(headerValue).isDisplayed();

	}

	private WebElement getContactElement(String contactText) {
		return elementUtil.getElementByXpathText(contactText);
	}

	
	public boolean ifContactExist(String contactText) {
		return getContactElement(contactText).isDisplayed();

	}
}

