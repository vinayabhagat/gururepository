package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	//Upcasting
	//maximize the window
	//implicitliy wait
	//pageLoadTimeout
	//deleteAllCookies
	//open url
	
	public static WebDriver driver;
	
	public static void initialization()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	}
	
}
