package PageLayer;

import static UtilityLayer.HandleDropDown.selectByVisibleText;
import static UtilityLayer.UtilsClass.click;
import static UtilityLayer.UtilsClass.sendKeys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {

	static String UserName = null;
	static String PassWord = null;
	// locate the webelement with the help of @FindBy annotation and store inside
	// the global private webElement variable
	// initialize the object repository with the help of PageFactory class in
	// constructor
	// write the associated functionality methods of the object repository without
	// entering the test data

	@FindBy(name = "firstName")
	private WebElement firstname;

	@FindBy(name = "lastName")
	private WebElement lastname;

	@FindBy(name = "phone")
	private WebElement phone;

	@FindBy(name = "userName")
	private WebElement email;

	@FindBy(name = "address1")
	private WebElement address;

	@FindBy(name = "city")
	private WebElement city;

	@FindBy(name = "state")
	private WebElement state;

	@FindBy(name = "postalCode")
	private WebElement postalcode;

	@FindBy(name = "country")
	private WebElement country;

	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "confirmPassword")
	private WebElement confirmpassword;

	@FindBy(name = "submit")
	private WebElement submitbutton;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void registerPageFunctionality(String fname, String lname, String Phone, String Email, String Address,
			String City, String State, String PostalCode, String Country, String Username, String Password,
			String ConfirmPassword) {

		sendKeys(firstname, fname);
		sendKeys(lastname, lname);
		sendKeys(phone, Phone);
		sendKeys(email, Email);
		sendKeys(address, Address);
		sendKeys(city, City);
		sendKeys(state, State);
		sendKeys(postalcode, PostalCode);
		selectByVisibleText(country, Country);
		UserName = Username;
		sendKeys(username, Username);
		PassWord = Password;
		sendKeys(password, Password);
		sendKeys(confirmpassword, ConfirmPassword);
		click(submitbutton);

	}

}
