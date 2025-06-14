package fundamentals;

public class BankTrasactions {

	static int mainBalance = 100000;

	public void deposit(int depositAmount) {
		mainBalance = mainBalance + depositAmount;
	}

	public void withdrawl(String accountType, int withdrawl) {
		if (mainBalance >= withdrawl) {
			switch (accountType) {
				case "SAVINGS":
					if (withdrawl <= 50000) {
						mainBalance = mainBalance - withdrawl;
					} else {
						System.out.println("Withhdrawl Limit for Savings account 50000 only");
					}
					break;
	
				case "CURRENT":
					if (withdrawl <= 500000) {
						mainBalance = mainBalance - withdrawl;
					} else {
						System.out.println("Withhdrawl Limit for Current account 500000 only");
					}
					break;
	
				case "RETAIL":
					if (withdrawl <= 1000000) {
						mainBalance = mainBalance - withdrawl;
					} else {
						System.out.println("Withhdrawl Limit for Retail account 1000000 only");
					}
					break;
				default:
					break;
			}

		} else {
			System.out.println("Insufficent Balance");
		}
	}

	public void displayBalance() {
		System.out.println("Balance Amount: " + mainBalance);
	}

	public static void main(String[] args) {

		BankTrasactions iciciBank = new BankTrasactions();
		iciciBank.displayBalance();
		System.out.println("-----------Deposit 5000-------------");
		iciciBank.deposit(5000);
		iciciBank.displayBalance();

		System.out.println("-----------Withdrawl 3000-------------");
		BankTrasactions hdfcBank = new BankTrasactions();
		hdfcBank.withdrawl("SAVINGS",3000);
		hdfcBank.displayBalance(); // 102000

		System.out.println("-----------Withdrawl 110000-------------");
		BankTrasactions sbiBank = new BankTrasactions();
		sbiBank.withdrawl("SAVINGS",110000);
		sbiBank.withdrawl("SAVINGS",60000);
		
		sbiBank.withdrawl("SAVINGS",50000);
		
		sbiBank.displayBalance();

	}

}
