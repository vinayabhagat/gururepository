package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterSuccessPage;

public class RegisterSuccessPageTest extends BaseClass {

	// mention pre condition
	// write the test cases with the help of
	// @Test annotation and call the associated functionality methods from
	// associated classes
	// from page layer package at the time of calling the method pass the test data
	// mention post condition

	RegisterSuccessPage register;

	@Test(priority = 1)
	public void validateSuccessPageUrl() {
		register = new RegisterSuccessPage();
		String actualUrl = register.captureTheUrl();
		Assert.assertEquals(actualUrl.contains("sucess"), true);
	}

	@Test(priority = 2)
	public void clickOntheSignUpLinkInSuccessPage() {
		register.clickOnSignUpLink();
	}
}
