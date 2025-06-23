package fundamentals;

import calculator.Calculator;
import calculator.UseCalculator;

public class ArithematicOperations {

	public static void main(String[] args) {
//		Calculator calc = new ImplementCalculator();
		Calculator calc = new UseCalculator();
		calc.addition(10, 20);
	}

}
