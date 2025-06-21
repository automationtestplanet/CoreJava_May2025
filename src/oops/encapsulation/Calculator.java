package oops.encapsulation;

public class Calculator {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	protected void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	private void division(int a, int b) {
		System.out.println(a / b);
	}
}
