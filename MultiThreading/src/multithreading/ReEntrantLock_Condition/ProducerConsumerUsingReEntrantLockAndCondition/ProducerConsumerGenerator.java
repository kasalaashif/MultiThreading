package multithreading.ReEntrantLock_Condition.ProducerConsumerUsingReEntrantLockAndCondition;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ProducerConsumerGenerator {
	private int[] buffer;
	Lock lock = new ReentrantLock();
	Condition full = lock.newCondition();
	Condition empty = lock.newCondition();
	int addProduct = 0;
	int consumeProduct = 0;
	int count=0;
	int bufferLength;
	
	ProducerConsumerGenerator(int i)
	{
		buffer = new int[i];
		bufferLength = i;
	}
	
	public void producer()
	{
		try 
		{
			lock.lock();
			while(count== bufferLength)
				full.await();
			buffer[addProduct] = addProduct;
			System.out.println("Produced: "+ buffer[addProduct]);
			addProduct = (addProduct+1) % bufferLength;
			count++;
			empty.signal();
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
	
	public void consumer()
	{
		try
		{
			lock.lock();
			while(count == 0)
				empty.await();
			buffer[consumeProduct] = consumeProduct;
			System.out.println("Consumed: "+ buffer[consumeProduct]);
			consumeProduct = (consumeProduct+1) % bufferLength;
			count--;
			full.signal();
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
}
