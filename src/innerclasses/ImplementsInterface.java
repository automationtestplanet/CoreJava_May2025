package innerclasses;

public class ImplementsInterface implements Interface1 {

	@Override
	public void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	@Override
	public void division(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {	
		Interface1 inf1 = new ImplementsInterface();
		inf1.multiplication(100, 200);
	}

}
