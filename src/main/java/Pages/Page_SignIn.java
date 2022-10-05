package Pages;

import org.openqa.selenium.WebDriver;

import Models.Model_Login;
import Models.Model_SignIn;
import Utils.Base;
import Utils.HandleControls;

public class Page_SignIn{

	
	WebDriver _driver;
	
	public Page_SignIn(WebDriver Driver)
	{
		_driver = Driver;
	}
	
	
	public void SignIn()
	{		
		Model_SignIn Obj_Model_Login=new Model_SignIn(_driver);
		
		HandleControls Controls=new HandleControls(_driver);
		
		Controls.SetText(Obj_Model_Login.UserName(), "TESTUSERS01@gmail.com");
		Controls.SetText(Obj_Model_Login.password(), "TESTUSERS01@gmail.com");
		Controls.ClickControl(Obj_Model_Login.signon(), "Login");
	}	
}
