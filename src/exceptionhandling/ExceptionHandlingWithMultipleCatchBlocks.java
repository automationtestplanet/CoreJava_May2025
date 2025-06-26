package exceptionhandling;

public class ExceptionHandlingWithMultipleCatchBlocks {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		System.out.println("Execution Started");
		int a = 100;
		int b = 3;
		String str = "Hello";
		int[] intArr = { 1, 2, 3 };

		try {
			System.out.println(a / b); // ArithmeticException
			System.out.println(str.toUpperCase()); // NullPointerException
			System.out.println(intArr[2]); // ArrayIndexOutOfBoundsException
			System.out.println(Integer.parseInt(str));
		} catch (ArithmeticException ae) {
			System.out.println("Division by zero not posible");
		} catch (NullPointerException ne) {
			System.out.println("String value can not be null");
		} catch (ArrayIndexOutOfBoundsException arrE) {
			System.out.println("Index not found to get the value");
		} catch (NumberFormatException numE) {
			System.out.println("Can nnot convert non-Number string to integer");
		}
		
		try {
			System.out.println(a / b); // ArithmeticException
			System.out.println(str.toUpperCase()); // NullPointerException
			System.out.println(intArr[2]); // ArrayIndexOutOfBoundsException
			System.out.println(Integer.parseInt(str));
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException ae) {
			System.out.println(ae.getMessage());
		} 
		
		try {
			System.out.println(a / b); // ArithmeticException
			System.out.println(str.toUpperCase()); // NullPointerException
			System.out.println(intArr[2]); // ArrayIndexOutOfBoundsException
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		

		System.out.println("Execution Ended");
	}

}
