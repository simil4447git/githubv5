package TestModules;



public class ChildClass1 extends AbstractClass 
{

	public ChildClass1()
	{
		System.out.println("From Child Class > Constructor");
	}
	
	
	int vbl_count=1;
	
	
	@Override
	public void AbstractMethod1() {
		
		System.out.println("From Child Class > AbstractMethod1");
		
		System.out.println(vbl_count); //1 
		
		System.out.println(this.vbl_count); //1
		
		System.out.println(super.vbl_count); //0
		
		System.out.println(super.vbl_2); //0 
	}

}


