package oops.inheritance;

public class UseCalculator {

	public void displayText(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {

//		addition(100, 200); 
//		subtraction(10, 5);  
//		multiplication(10, 3);
//		division(10,3);	

		Calculator calc = new Calculator();
		calc.addition(100, 200);
		calc.subtraction(10, 5);
		calc.multiplication(10, 3);
		calc.division(10, 3);
			
		
//		calc.displayText("Hello Java");  // error
		
		NewCalculator newCalc = new NewCalculator();
		newCalc.addition(100, 200);
		newCalc.subtraction(10, 5);
		newCalc.multiplication(10, 3);
		newCalc.division(10, 3);	
		newCalc.modDivision(10, 3);
	}

}
