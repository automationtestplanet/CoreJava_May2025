package oops.interfaces;

public class ExtendClassAndImplementInterface extends Class1 implements Interface1, Interface2, Interface3 {

	@Override
	public void subtraction(int a, int b) {
		System.out.println(a - b);

	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		ExtendClassAndImplementInterface obj = new ExtendClassAndImplementInterface();
		obj.addition(10, 20);
	}

}
