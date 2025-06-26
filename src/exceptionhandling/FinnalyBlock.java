package exceptionhandling;

public class FinnalyBlock {

	public static void division(int a, int b) {
		System.out.println(a / b);
	}
	
	
	public static int muliplication(int a, int b) {
		try {
			return a * b;
		}catch(Exception e) {			
			System.out.println(e.getMessage());
			return a * b;
		}finally {
			System.out.println("multiplication method executed");
		}
	}

	public static void main(String[] args) {

		try {

			System.out.println("Open the Database");

			division(100, 1);
			
		} catch (Exception e) {			
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("Close the Database");
		}
		
		
		System.out.println(muliplication(10,20));

	}

}
