package oops.abstraction;

public class ImplementInterfaceExample implements InterfaceExample {

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);
	}

	@Override
	public void subtraction(int a, int b) {		
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		
		InterfaceExample inf = new ImplementInterfaceExample();		
		inf.addition(10, 20);
		InterfaceExample.display();
		System.out.println(inf.A);
	}

}
