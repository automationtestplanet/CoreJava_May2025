package oops.abstraction;

public class UseAbstractCalculatorClass {

	public static void main(String[] args) {
		
		AbstractCalculatorClass absCalc = new ImplementAbstractCalculatorClass();
		System.out.println(absCalc.addition(10, 20));
		
		ImplementAbstractCalculatorClass impAbsCls = (ImplementAbstractCalculatorClass)absCalc;
		System.out.println(impAbsCls.division(10.0f, 20.0f));
		
		System.out.println(impAbsCls.modDivison(10,3));
		
	}

}
