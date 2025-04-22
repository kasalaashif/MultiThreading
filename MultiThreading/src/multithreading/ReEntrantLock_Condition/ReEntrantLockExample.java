package multithreading.ReEntrantLock_Condition;

public class ReEntrantLockExample {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread incrementThread = new Thread(()->
		{for(int i=0; i< 10; i++)
		 {
			try
			{
				counter.increment();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		 };
		}, "incrementThread");
		Thread decrementThread = new Thread(()->{
			for(int i=0; i< 10; i++)
			 {
				try
				{
					counter.decrement();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			 }
			}, "decrementThread");
		
		Thread incrementThread2 = new Thread(()->
		{for(int i=0; i< 10; i++)
		 {
			try
			{
				counter.increment();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		 };
		}, "incrementThread");
		
		Thread decrementThread2 = new Thread(()->{
			for(int i=0; i< 10; i++)
			 {
				try
				{
					counter.decrement();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			 }
			}, "decrementThread");

		
		incrementThread.start();
		decrementThread.start();
		incrementThread2.start();
		decrementThread2.start();
		incrementThread.join();
		decrementThread.join();
		incrementThread2.join();
		decrementThread2.join();

	}

}
