package exceptionhandling;

public class UserDefinedException extends Exception {
	public UserDefinedException(String message) {
		System.out.println(message);
	}
}
