package oops.encapsulation;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addition(100, 200); // public method
		calc.subtraction(10, 5);  // protected method
		calc.multiplication(10, 3); // default method
//		calc.division(10,3);  // private method can not be accessed outside the class
	}

}
