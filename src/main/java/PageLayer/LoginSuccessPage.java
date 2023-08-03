package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginSuccessPage extends BaseClass{
	
	//locate the webelement with the help of @FindBy annotation and store inside the global private webElement variable
		//initialize the object repository with the help of PageFactory class in constructor
		//write the associated functionality methods of the object repository without entering the test data
		
	@FindBy (xpath="//h3[text()='Login Successfully']")
	private WebElement loginsuccessphysicaltext;
	
	public LoginSuccessPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String captureSuccessMessage() {
		return loginsuccessphysicaltext.getText();
	}
}
