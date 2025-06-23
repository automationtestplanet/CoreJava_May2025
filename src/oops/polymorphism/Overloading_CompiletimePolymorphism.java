package oops.polymorphism;

public class Overloading_CompiletimePolymorphism {

	void addition(int a, int b) {  // method signature
		System.out.println("Addition of " + a + " and " + b + " : " + (a + b));
	}
	
	
	void addition(float a, int b) { // method signature is same as above
		System.out.println("Addition of " + a + " and " + b + " : " + (a + b));
	}

	void addition(float a, float b) { // method signature is not same as above
		System.out.println("Addition of " + a + " and " + b + " : " + (a + b));
	}

	void addition(String a, String b) {
		System.out.println("Addition of " + a + " and " + b + " : " + (a + b));
	}
	
//	void addition(String a, String b) {
//		System.out.println("Addition of " + a + " and " + b + " : " + (a +" "+ b));
//	}

	void addition(String a, char b) {
		System.out.println("Addition of " + a + " and " + b + " : " + (a + b));
	}

	void addition(int a, int b, int c) {
		System.out.println("Addition of " + a + " and " + b + " : " + (a + b + c));
	}
	
//	void addition(int a, int b, int c, int d) {
//		System.out.println("Addition of " + a + " and " + b + " : " + (a + b + c + d));
//	}
//	
//	void addition(int a, int b, int c, int d, int e) {
//		System.out.println("Addition of " + a + " and " + b + " : " + (a + b + c + d + e));
//	}
	
	void addition(int ...a) { // VarArgs
		
		int sum = 0;
		for(int eachVal:a) {
			sum+=eachVal;
		}
		System.out.println("Addition  : " + sum);
	}

	public static void main(String[] args) {
		Overloading_CompiletimePolymorphism overloading = new Overloading_CompiletimePolymorphism();

		overloading.addition(10, 20);
		overloading.addition(10.5F, 20.5F);
		overloading.addition(10.5F, 20);
		overloading.addition(10, 20.5F);
		overloading.addition("Hello", "Java");
		overloading.addition("Hello", 'C');
		overloading.addition(10, 20, 30);
		overloading.addition(10, 20, 30, 40);
		overloading.addition(10, 20, 30 ,40, 50);		
		overloading.addition(10, 20, 30 ,40, 50, 60);
		overloading.addition(10, 20, 30 ,40, 50, 60, 70);
		overloading.addition(10, 20, 30 ,40, 50, 60, 70, 80);
		overloading.addition(10, 20, 30 ,40, 50, 60, 70, 80, 90);

	}

}
