package producerConsumerUsingBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.*;

public class SharedBlockingQueue {
	
	BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
	ReentrantLock lock = new ReentrantLock();
	int prod = 1;
	
	public void produce() throws InterruptedException {
			queue.put(prod);
			System.out.println("Produced: " + prod);
			prod++;
	}
	
	public void consume() throws InterruptedException {
			System.out.println("Consumed: " + queue.take());
		}
}
