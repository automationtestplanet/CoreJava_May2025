package fundamentals;

import calculator.Calculator;

public class NewArithematicOperations {

	public static void main(String[] args) {
		
		Calculator calc = new UseNewCalculator();
		System.out.println(calc.addition(10, 20));
		
		NewCalculator newCalc = (NewCalculator)calc;
		System.out.println(newCalc.modDivision(10, 20));
	}

}
