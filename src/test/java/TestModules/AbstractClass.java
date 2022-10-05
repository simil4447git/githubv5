

package TestModules;


//Abstract Class
public abstract class AbstractClass {
	
	
	int vbl_count=0;
	
	int vbl_2=0;
	
	public AbstractClass()
	{
		System.out.println("From AbstractClass > Constructor");
	}
	
	public abstract void AbstractMethod1();
		
	public void concreateMethod1()
	{
		System.out.println("From Abstract Class > Concrete Method");
	}

}



