package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	// write reusable script for clickOnElement methd and enterTextToTextbox without
	// locating the element and without entering the test data

	public static void sendKeys(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}

	public static void click(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

}
