package exceptionhandling;

public class UseUserDefinedExcpetion {

	public static void printNumber(int number) throws UserDefinedException {

		if (number > 100) {
			System.out.println(number);
		} else {
			throw new UserDefinedException("Provide number greater than 100");
		}
		
		

	}

	public static void main(String[] args) throws UserDefinedException {
		printNumber(100);
	}

}
