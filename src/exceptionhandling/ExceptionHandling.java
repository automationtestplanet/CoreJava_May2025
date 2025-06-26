package exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Execution Started");

		int a = 100;
		int b = 0;
		int c = 200;

		Thread.sleep(10000); // for pausing the execution for 10 seconds

//		try {
//			Thread.sleep(10000);   // for pausing the execution for 10 seconds
//		}catch(InterruptedException ie) {
//			
//		}

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println(a / 1);
		}

		System.out.println("Execution End");
		System.out.println("Execution End");
		System.out.println("Execution End");
		System.out.println("Execution End");
		System.out.println("Execution End");
		System.out.println("Execution End");
		System.out.println("Execution End");
		System.out.println("Execution End");

	}

}
