package oops.polymorphism;

public class Overriding_RuntimePolymorphism {
	
	void addition(String a, String b) {
		System.out.println("Addition of " + a + " and " + b + " : " + (a + b));
	}
	
//	void addition(String a, String b) {
//		System.out.println("Addition of " + a + " and " + b + " : " + (a +" "+ b));
//	}

	public static void main(String[] args) {
		Overriding_RuntimePolymorphism overiding = new Overriding_RuntimePolymorphism();
		overiding.addition("Hello", "Java");

	}

}
