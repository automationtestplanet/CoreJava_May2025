package oops.polymorphism;

public class UpCastingAndDownCasting {

	public static void main(String[] args) {

		ArithematicOperations arOp = new ArithematicOperations(); // Parent
		arOp.addition(10, 20);
		arOp.subtraction(10, 20);
		arOp.multiplication(10, 20);
		arOp.division(10, 20);
//		arOp.modDivison(10,20); // error

		NewArithematicOperations newArOp = new NewArithematicOperations(); // Child
		newArOp.addition(10, 20);
		newArOp.subtraction(10, 20);
		newArOp.multiplication(10, 20);
		newArOp.division(10, 20);
		newArOp.modDivison(10, 20);

		int i1 = 200;

		short s1 = 100;

		i1 = s1; // int is bigger than short // Implicit conversion

		s1 = (short) i1; // short is less than int // Explicit conversion

		arOp = newArOp; // Up-Casting
		arOp.addition(10, 20);
		arOp.subtraction(10, 20);
		arOp.multiplication(10, 20);
		arOp.division(10, 20);
//		arOp.modDivison(10,20); // compile time error

		newArOp = (NewArithematicOperations) arOp; // Down-Casting
		newArOp.addition(10, 20);
		newArOp.subtraction(10, 20);
		newArOp.multiplication(10, 20);
		newArOp.division(10, 20);
		newArOp.modDivison(10, 20);

		System.out.println("------------------------------");
		arOp.addition(10, 20); // 35 overrding method will be called here
		newArOp.addition(10, 20); // 35

		System.out.println("------------------------------");
		ArithematicOperations arithematicOp = new NewArithematicOperations(); // Upcasting
		arithematicOp.addition(10, 20);

		NewArithematicOperations newArithematicOp = (NewArithematicOperations) arithematicOp; // downcasting
		newArithematicOp.modDivison(10, 3);
		
		arithematicOp.subtraction(10, 20);
		newArithematicOp.subtraction(10, 20); // static methods we can not override

	}

}
