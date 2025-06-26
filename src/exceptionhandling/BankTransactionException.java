package exceptionhandling;

public class BankTransactionException extends Exception {
	public BankTransactionException(String messgae) {
		System.out.println(messgae);
	}
}
