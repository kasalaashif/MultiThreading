package bankTransactionSynchronization;

public class TransactionManagement extends Thread{
	BankAccount from;
	BankAccount to;
	int amount;
	
	public TransactionManagement(BankAccount from, BankAccount to, int amount) {
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
	
	public void run()
	{
		synchronized(from) {
			synchronized(to) {
				from.withdrawal(amount);
				to.deposit(amount);
			}
		}
		
	}

}
