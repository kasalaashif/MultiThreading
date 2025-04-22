package multithreading.ReEntrantLock_Condition;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	private int count =0;
	ReentrantLock lock = new ReentrantLock();
	
	public void increment()
	{
		try
		{
			lock.lock();
			count++;
			System.out.println(Thread.currentThread().getName() +": " +getCount());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
	}
	public void decrement()
	{
		try
		{
			lock.lock();
			count--;
			System.out.println(Thread.currentThread().getName() +": " +getCount());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
	}
	public int getCount()
	{
		return count;
	}
}
