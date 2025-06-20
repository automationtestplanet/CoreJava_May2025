package oops.polymorphism;

public class NewArithematicOperations extends ArithematicOperations {

	void modDivison(int a, int b) {
		System.out.println(a % b);
	}
	
	@Override
	void addition(int a, int b) {
		System.out.println(a + b + 5);
	}
	
//	@Override
	static void subtraction(int a, int b) {
		System.out.println(a - b - 10);
	}
	
//	@Override
//	void multiplication(int a, int b) {  // Final methods we can not override
//		System.out.println(a * b);
//	}
}
