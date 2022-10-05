package TestModules;

public class MainClass {

	public static void main(String[] args) {
		
		
		System.out.println("Hi");
		
		ChildClass1 cls_obj=new ChildClass1();
				
		cls_obj.AbstractMethod1();
		
		cls_obj.concreateMethod1();
		
		System.out.println(cls_obj.vbl_count); //1
		
		System.out.println(cls_obj.vbl_2); //0

	}

}







