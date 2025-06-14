package fundamentals;

public class TypesOfVariables {

	static int x = 11;
	static int y = 2;

	public static void addition() {
		System.out.println("Addition: " + (x + y));
	}

	public static void subtraction() {
		System.out.println("Subtraction: " + (x - y));
	}

	public static void multiplication() {
		System.out.println("Multiplication: " + (x * y));
	}

	public static void division() {
		System.out.println("Division Quotient: " + (x / y));
	}

	public static void modDivision() {
		System.out.println("ModDivison Remainder: " + (x % y));
	}

	public static void main(String[] args) {
		addition();
	}

}
