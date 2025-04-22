package deadLockScenario;

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
			System.out.println("From: " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized(to) {
				System.out.println("To: " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				from.withdrawal(amount);
				to.deposit(amount);
			}
		}
		
	}

}
