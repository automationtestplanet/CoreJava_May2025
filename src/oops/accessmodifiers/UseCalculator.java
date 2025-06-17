package oops.accessmodifiers;
import oops.encapsulation.Calculator;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addition(100, 200);
//		calc.subtraction(10, 5); // protected method of another package can not be accessed
//		calc.multiplication(10, 3);  // default method of another package can not be accessed
//		calc.division(10,3);  // private method can not be accessed outside the package
	}

}
