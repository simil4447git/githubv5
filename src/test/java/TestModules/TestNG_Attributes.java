package TestModules;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNG_Attributes {
	
	
	@Test()//No Priority
	public void Login2() 
	{
		System.out.println("Inside No Priority Set");
	}
	
	/*@Test()//Compile Error, method not allowed with priority 0
	public void Login3(priority=0) 
	{
		System.out.println("Inside TestMethod1");
	}*/
	
	
	@Test(description="Login To App",priority=1)
	public void Login() 
	{
		System.out.println("Inside Priority=1");
	}
	
	
	@Test(description="Create Employee",priority=2) //same priority for two methods
	public void CreateEmployee() throws InterruptedException 
	{
		Thread.sleep(500);  
		System.out.println("Inside same priority for two methods-CreateEmployee");
	}
	
	
	@Test(description="Update Employee",priority=2)//same priority for two methods
	public void UpdateEmployee() throws InterruptedException 
	{
		Thread.sleep(500);  
		System.out.println("Inside same priority for two methods-UpdateEmployee");
	}
	
	
	
}


