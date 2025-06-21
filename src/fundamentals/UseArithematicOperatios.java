package fundamentals;

import oops.accessmodifiers.ArithematicOperations;

public class UseArithematicOperatios extends ArithematicOperations{

	public static void main(String[] args) {
		ArithematicOperations arOp = new ArithematicOperations();
		
		arOp.addition(10, 20);   // public method can be accessed outside the package
//		arOp.subtraction(20, 10); // default method can not be accessed outside the package
//		arOp.multiplication(10, 20); // protected method can not be accessed outside the package
//		arOp.division(10,3);  // private method we can not access outside the package

		UseArithematicOperatios useArOp	= new UseArithematicOperatios();
		
		arOp.addition(10, 20);   // public method can be accessed outside the package
//		useArOp.subtraction(20, 10); // default method can not be accessed outside the package eventhough it is extended
		useArOp.multiplication(10, 20); // protected method can be accessed outside the package if we extend it
//		useArOp.division(10,3);  // private method we can not access outside the package eventhough it is extended
	}

}
