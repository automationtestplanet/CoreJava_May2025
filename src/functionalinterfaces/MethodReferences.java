package functionalinterfaces;

public class MethodReferences {

	int modDivision(int a, int b) {
		return a % b;
	}

	static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		MethodReferences methodRef = new MethodReferences();
//		System.out.println(methodRef.modDivision(10, 3));
//		System.out.println(MethodReferences.division(10, 2));
		
		
		FunctionalInterface4 funInf4 = methodRef::modDivision;   // Instance method reference
		System.out.println(funInf4.multiplication(10, 3));
		
		FunctionalInterface4 funInf4_1 = MethodReferences::division;   // static reference
		System.out.println(funInf4_1.multiplication(10, 3));
	}

}
