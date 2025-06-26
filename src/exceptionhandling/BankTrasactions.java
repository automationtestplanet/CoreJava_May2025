package exceptionhandling;

import enums.AccountType;

public class BankTrasactions {

	static int mainBalance = 100000;

	public void deposit(int depositAmount) {
		mainBalance = mainBalance + depositAmount;
	}

	public void withdrawl(AccountType accountType, int withdrawl) throws BankTransactionException {
		if (mainBalance >= withdrawl) {
			switch (accountType) {
			case SAVINGS:
				if (withdrawl <= 50000) {
					mainBalance = mainBalance - withdrawl;
				} else {
					throw new BankTransactionException("Withhdrawl Limit for Savings account 50000 only");
				}
				break;

			case CURRENT:
				if (withdrawl <= 500000) {
					mainBalance = mainBalance - withdrawl;
				} else {
					throw new BankTransactionException("Withhdrawl Limit for Current account 500000 only");
				}
				break;

			case RETAIL:
				if (withdrawl <= 1000000) {
					mainBalance = mainBalance - withdrawl;
				} else {
					throw new BankTransactionException("Withhdrawl Limit for Retail account 1000000 only");
				}
				break;
			default:
				break;
			}

		} else {
			throw new BankTransactionException("Insufficent Balance");
		}
	}

	public void displayBalance() {
		System.out.println("Balance Amount: " + mainBalance);
	}
}
