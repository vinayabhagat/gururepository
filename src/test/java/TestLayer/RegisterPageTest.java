package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass {
	
	//mention pre condition 
	// write the test cases with the help of
	//@Test annotation and call the associated functionality methods from associated classes 
	//from page layer package at the time of calling the method pass the test data
	// mention post condition
	
	@BeforeTest
	public void setUp()
	{
		initialization();
	}
	
	@Test 
	public void validateRegisterPageFunctionality()
	{
		RegisterPage registerpage = new RegisterPage();
		registerpage.registerPageFunctionality("Paritosh", "Patil", "1234567890", "paritosh@gmail.com", "Nagpur", "Nagpur", "Maharashtra", "123456", "ANGOLA", "paritosh123", "paritosh@123", "paritosh@123");
	}
	
	@AfterTest
	public void tearDown()
	{
		
	}

}
