package multithreading;
import java.util.concurrent.Semaphore;

public class SemaphoreExample implements Runnable{
	private static Semaphore semaphore = new Semaphore(2);
	public void run()
	{
		try
		{
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName());
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		finally
		{
			semaphore.release();
		}
	}
}
