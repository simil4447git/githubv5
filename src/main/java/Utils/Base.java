package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
	private WebDriver _driver;
	
	private static boolean initialized = false;

	   
	
	public Base()
	{
		if(!initialized)
		{
			WebDriverManager.chromedriver().setup();
		
			ChromeDriver chrmdriver=new ChromeDriver();
		
			_driver =chrmdriver;
		
			initialized =true;
		}
	}
	
	public WebDriver getDriver() {
	      return _driver;
	   }

}
