package oops.accessmodifiers;

public class UseArithematicOperatios2 {

	public static void main(String[] args) {
		ArithematicOperations2 arOp = new ArithematicOperations2();
		
		arOp.addition(10, 20);   // public method can be accessed with in the package
		arOp.subtraction(20, 10); // default method can be accessed with in the package
		arOp.multiplication(10, 20); // protected method can be accessed with in the package
//		arOp.division(10,3);  // private method we can not access outside of class

	}

}
