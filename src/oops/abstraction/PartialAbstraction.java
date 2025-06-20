package oops.abstraction;

abstract public class PartialAbstraction {
	
	// this methods returns addition of two numbers, you need to pass two numbers here.
	abstract public int addition(int a, int b);  // abstract method / non-concrete methods / method without body
	
	public int subtraction(int a, int b) {  // non-abstract methods  / concrete method / method with body
		return a-b;
	}
	
	public static void main(String[] args) {
//		PartialAbstraction parAbs = new PartialAbstraction();   // we can not create a object for Abstract classes.
	}
}
