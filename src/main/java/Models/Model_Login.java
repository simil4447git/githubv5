package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



//Page Objective Model

public class Model_Login {
	
	By By_SignInLink = By.xpath("//a[text()='Sign In']");
	
	WebDriver Driver;
	
	public Model_Login(WebDriver _driver)
	{
		this.Driver=_driver;
	}
	
	
	public WebElement SignInLink()
	{
		return Driver.findElement(By_SignInLink);
	}
	

}


