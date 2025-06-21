package oops.polymorphism;

public class Calculator {

	void addition(int a, int b) {
		System.out.println(a + b);
	}

	void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	void division(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addition(10, 20);

//		calc.addition(10.5, 20.5); // Error
//
//		calc.addition(10.5, 20); // Error
//
//		calc.addition(10, 20.5); // Error
//
//		calc.addition("Hello", "Java"); // Error
//
//		calc.addition("Hello", 'C'); // Error
//
//		calc.subtraction(100.34E34, 99.4E56); // Error
//
//		calc.multiplication(10.5, 5.5); // Error
//
//		calc.division(100.05F, 10.0F); // Error
	}
}
