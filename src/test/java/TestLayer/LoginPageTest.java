package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage login;
	// mention pre condition
	// write the test cases with the help of
	// @Test annotation and call the associated functionality methods from
	// associated classes
	// from page layer package at the time of calling the method pass the test data
	// mention post condition
	@Ignore
	@Test(priority = 1)
	public void closPopUp() {
		login = new LoginPage();
		login.clickOnPopUp();
	}

	@Test(priority = 2)
	public void validateLoginPageUrl() throws Exception {
		Thread.sleep(7000);
		login = new LoginPage();
		String actualUrl = login.captureUrl();
		Assert.assertEquals(actualUrl.contains("login"), true);
	}

	@Test(priority = 3)
	public void validateLoginpageFunctionality() {
		login.loginPageFunctionality();
	}

}
