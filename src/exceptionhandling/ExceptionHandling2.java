package exceptionhandling;

public class ExceptionHandling2 {
	
	public static void division(int a, int b) {
		try {
			System.out.println("Division: "+a/b);
//			ArithmeticException ae = new ArithmeticException();
//			throw new ArithmeticException();
		}catch(ArithmeticException ae) {
			System.out.println("Division by 0 isnot possible");
		}
	}

	public static void main(String[] args) {
		
		division(10,0);
			

	}

}
