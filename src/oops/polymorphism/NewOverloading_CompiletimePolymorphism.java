package oops.polymorphism;

public class NewOverloading_CompiletimePolymorphism extends Overloading_CompiletimePolymorphism {

	void addition(String a, String b, String c) {
		System.out.println("Addition: "+ a+b+c);
	}
	
	public static void main(String[] args) {
		NewOverloading_CompiletimePolymorphism newOverload = new NewOverloading_CompiletimePolymorphism();
		newOverload.addition("Hello","Java");
		newOverload.addition("Hello","Java","World");
	}

}
