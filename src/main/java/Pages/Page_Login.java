package Pages;

import Utils.Base;
import Utils.HandleControls;

import org.openqa.selenium.WebDriver;

import Models.Model_Login;



public class Page_Login extends Base{

	WebDriver _driver;
	public WebDriver LaunchBrowser(String Url)
	{
		_driver = getDriver();
		
		_driver.get(Url);
		
		return _driver;
	}
	
	
	public void NavigateToSignIn()
	{
		Model_Login Obj_Model_Login=new Model_Login(_driver);
		
		HandleControls Controls=new HandleControls(_driver);
		
		Controls.ClickControl(Obj_Model_Login.SignInLink(), "Sign In");
	}
	
	
}
