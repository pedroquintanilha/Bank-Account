package entities;

public class BankAccount {

	     private int accountNumber;
	     private String accountHolder;
	     private double accountBalance;
	     
		public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
		    increaseBalance(initialDeposit);
		}

		public BankAccount(int accountNumber, String accountHolder) {
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
		}

		public int getAccountNumber() {
			return accountNumber;
		}

		public String getAccountHolder() {
			return accountHolder;
		}

		public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}

		public double getAccountBalance() {
			return accountBalance;
		}
		
		public void increaseBalance(double deposit) {
			accountBalance+=deposit;
			
		}
		
		public void decreaseBalance(double withdraw) {
			accountBalance-=withdraw+5.0;
			
		}
		 
		public String toString() {
			return "Account "
					+accountNumber
					+", Holder: "
					+accountHolder
					+", Balance: $ "
					+String.format("%.2f",accountBalance);
				
		}
  
		}
		
		
		
	     
	     
