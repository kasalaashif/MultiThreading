package deadLockScenarioResolvedUsingReEntrantLock;

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
		if(from.lock.tryLock()){
			System.out.println("From: " + Thread.currentThread().getName());
			try {
				Thread.sleep(1);
				if(to.lock.tryLock()) {
					System.out.println("To: " + Thread.currentThread().getName());
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					finally {
						to.lock.unlock();
					}
					from.withdrawal(amount);
					to.deposit(amount);
				}
				else {
					System.out.println("Failed to Acquire TO Lock");
				}
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				from.lock.unlock();
			}
		}
		else {
			System.out.println("Failed to Acquire From Lock");
		}
		
	}

}
