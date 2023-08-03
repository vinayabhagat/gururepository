package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	// locate the webelement with the help of @FindBy annotation and store inside
	// the global private webElement variable
	// initialize the object repository with the help of PageFactory class in
	// constructor
	// write the associated functionality methods of the object repository without
	// entering the test data

	@FindBy(xpath = "//span[text()='Close']")
	private WebElement closepop;

	@FindBy(name = "userName")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "submit")
	private WebElement submit;

	public LoginPage()

	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnPopUp() {
		click(closepop);
	}

	public String captureUrl() {
		return getCurrentUrl();
	}

	public void loginPageFunctionality() {

		sendKeys(username, RegisterPage.UserName);
		sendKeys(password, RegisterPage.PassWord);
		click(submit);
	}

}
