package multithreading;
import java.util.concurrent.CyclicBarrier;
public class CyclicBarrierExample implements Runnable {
	private CyclicBarrier barrier;
	public CyclicBarrierExample(CyclicBarrier barrier)
	{
		this.barrier = barrier;
	}
	
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName() + "before Barrier");
			barrier.await();
			System.out.println(Thread.currentThread().getName() + "After Barrier");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
