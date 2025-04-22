package bankTransactionSynchronization;

public class BankAccount {
	int balance = 100;

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdrawal(int amount) {
		this.balance = this.balance - amount;
	}

	public void deposit(int amount) {
		this.balance = this.balance + amount;	
	}
	
}
