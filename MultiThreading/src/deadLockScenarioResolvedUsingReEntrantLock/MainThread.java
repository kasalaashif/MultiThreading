package deadLockScenarioResolvedUsingReEntrantLock;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BankAccount from = new BankAccount();
		BankAccount to = new BankAccount();
		
		Thread thread = new Thread(new TransactionManagement(from, to, 100));
		Thread thread2 = new Thread(new TransactionManagement(to, from, 100));

		thread.start();
		thread2.start();
		thread.join();	
		thread2.join();
		System.out.println("From: " + from.getBalance());
		System.out.println("To: "+ to.getBalance());
	}
	

}
