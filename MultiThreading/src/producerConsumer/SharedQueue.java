package producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {
	Queue<Integer> sharedQueue = new LinkedList<>();
	int maxCapacity = 0;
	
	public synchronized void produce() throws InterruptedException {
		if(sharedQueue.size() == 1) {
			System.out.println("Queue is Full");
			wait();
		}
		System.out.println("Produced: " + maxCapacity);
		sharedQueue.add(maxCapacity++);
		notify();
	}
	
	public synchronized void consume() throws InterruptedException {
		if(sharedQueue.isEmpty() == true) {
			System.out.println("Queue is Empty. Nothing to Consume");
			wait();
		}
		System.out.println("Consumed: " + sharedQueue.peek());
		sharedQueue.poll();
		notify();
	}
	

}
