package TestModules;

import Pages.Page_Login;
import Pages.Page_SignIn;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test_LoginTest {

	WebDriver _driver;
	
  @Test(priority=1)
  public void VerifyHomeToSignIn() {
	  
	  Page_Login obj_Login=new Page_Login();
	  
	  _driver = obj_Login.LaunchBrowser("https://petstore.octoperf.com/actions/Catalog.action");
	  
	  obj_Login.NavigateToSignIn();
  }
  
  
  @Test(priority=2)
  public void SignIn() {
	  
	  Page_SignIn obj_Login=new Page_SignIn(_driver);
	  
	  obj_Login.SignIn();
  }
  
}

