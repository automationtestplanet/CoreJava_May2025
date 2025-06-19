package oops.polymorphism;

public class NewOverriding_Runtimepolymorphism extends Overriding_RuntimePolymorphism {


	void addition(String a, String b) {
		System.out.println("Addition of " + a + " and " + b + " : " + (a + " "+b));
	}
	
	public static void main(String[] args) {		
		NewOverriding_Runtimepolymorphism newOverriding = new NewOverriding_Runtimepolymorphism();
		newOverriding.addition("Hello", "Java");		
	}

}
