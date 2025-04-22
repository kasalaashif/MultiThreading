package multithreading.Synchronization;

public class SynchronizationCounter implements Runnable{
	private Counter counter = new Counter();
	
	public void run()
	{
		
		counter.increment();
		System.out.println(counter.getCount());
	}

}
