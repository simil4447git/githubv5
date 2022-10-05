package Utils;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleControls {

	WebDriver Driver;
	
	public HandleControls(WebDriver _driver)
	{
		this.Driver = _driver;
	}
	
	public void ClickControl(WebElement Element, String ElementName)
	{
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
		 
		wait.until(ExpectedConditions.visibilityOf(Element)).click();
		
	}
	
	public void SetText(WebElement Element, String Value)
	{
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
		 
		wait.until(ExpectedConditions.visibilityOf(Element)).click();
		
		Element.clear();
		
		Element.sendKeys(Value);
		
	}
	
}
