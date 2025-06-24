package oops.interfaces;

public class ImplementInterface implements Interface1, Interface2{

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println(a-b);
		
	}

	
	public static void main(String[] args) {
		ImplementInterface impInf = new ImplementInterface();
		impInf.addition(10, 20);
	}

	
}
