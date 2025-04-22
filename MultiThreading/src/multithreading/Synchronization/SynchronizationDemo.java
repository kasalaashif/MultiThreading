package multithreading.Synchronization;

public class SynchronizationDemo {
	public static void main(String[] args)
	{
		Thread[] threads = new Thread[3];
		for(int i=0; i<threads.length; i++)
		{
			threads[i] = new Thread(new SynchronizationCounter(), "Thread" + (i+1));
		}
		
		for(Thread thread: threads)
		{
			thread.start();
		}
	}

}
