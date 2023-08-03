package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
	
	//create reusable script for drop down without locating the weblements and without selecting the test data
	
	public static void selectByVisibleText(WebElement wb, String value)
	{
		new Select(wb).selectByVisibleText(value);
	}

}
