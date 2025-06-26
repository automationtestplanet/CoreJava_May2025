package exceptionhandling;

import enums.AccountType;

public class UseBankTransactions {

	public static void main(String[] args) {

		try {
			BankTrasactions iciciBank = new BankTrasactions();
			iciciBank.displayBalance();
			System.out.println("-----------Deposit 5000-------------");
			iciciBank.deposit(5000);
			iciciBank.displayBalance();

			System.out.println("-----------Withdrawl 3000-------------");
			BankTrasactions hdfcBank = new BankTrasactions();
			hdfcBank.withdrawl(AccountType.SAVINGS, 3000);
			hdfcBank.displayBalance(); // 102000

			System.out.println("-----------Withdrawl 110000-------------");
			BankTrasactions sbiBank = new BankTrasactions();
			sbiBank.withdrawl(AccountType.SAVINGS, 110000);
			sbiBank.withdrawl(AccountType.SAVINGS, 60000);

			sbiBank.withdrawl(AccountType.SAVINGS, 50000);

			sbiBank.displayBalance();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
