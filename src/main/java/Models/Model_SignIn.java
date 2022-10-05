package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Model_SignIn {
	
	By UserName = By.xpath("//input[@name=\"username\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By signon = By.xpath("//input[@name=\"signon\"]");
	
	WebDriver Driver;
	
	public Model_SignIn(WebDriver _driver)
	{
		this.Driver=_driver;
	}
	
	
	public WebElement UserName()
	{
		return Driver.findElement(UserName);
	}
	
	public WebElement password()
	{
		return Driver.findElement(password);
	}
	
	public WebElement signon()
	{
		return Driver.findElement(signon);
	}

}
