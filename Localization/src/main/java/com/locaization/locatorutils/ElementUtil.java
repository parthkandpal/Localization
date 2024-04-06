package com.locaization.locatorutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public WebElement getElement(String locatorType, String locatorValue) {

		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public static enum locators {
		ID, Name, Class, xpath, CssSelector, LinkText, PartialLinkText, TagName;

	}

	public By getBy(String locatorType, String locatorValue) {

		By locator = null;
		switch (locatorType.toLowerCase()) {

		case "id":
			locator = By.id(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "csselector":
			locator = By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		}
		return locator;

	}

	public WebElement getElementByXpathText(String text) {
		String xpath = "//a[contains(text(),'" + text + "')]";
		return getElement(locators.xpath.toString(), xpath);
	}

}
