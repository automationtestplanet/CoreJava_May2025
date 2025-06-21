package oops.abstraction;

public interface InterfaceExample {
	
//	public void adition(int a, int b) {  // we can not write implemented methods in interface
//		System.out.println(a+b);
//	}
	
//	public InterfaceExample() {  // we can not create any constructor in Interface
//		
//	}
	
	public static final int A=100;
	String STR = "Hello";
	
	public abstract void addition(int a, int b);  // instance method
	
	void subtraction(int a, int b);
	
	public static void display() {					// static method
		System.out.println("This is Interfaace");
	}
	
	default public void multiplication(int a, int b) {  // default method
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
//		InterfaceExample inf = new InterfaceExample(); // We can not create any object for Interface
		
		InterfaceExample.display();
//		InterfaceExample.a = 200;		
		System.out.println(InterfaceExample.A);
		
//		InterfaceExample.str = "Java";
		System.out.println(InterfaceExample.STR);
		
//		InterfaceExample.multiplication(10,20);
	}

}
