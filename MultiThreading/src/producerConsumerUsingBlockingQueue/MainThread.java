package producerConsumerUsingBlockingQueue;

public class MainThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		SharedBlockingQueue sharedQueue = new SharedBlockingQueue();	
		
		Thread producerThread = new ProducerThread(sharedQueue);
		Thread consumerThread = new ConsumerThread(sharedQueue);
		
		producerThread.start();
		consumerThread.start();
		
		producerThread.join();
		consumerThread.join();	
	}

}