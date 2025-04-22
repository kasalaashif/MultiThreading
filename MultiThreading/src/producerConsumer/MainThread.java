package producerConsumer;

public class MainThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		SharedQueue sharedQueue = new SharedQueue();	
		
		Thread producerThread = new ProducerThread(sharedQueue);
		Thread consumerThread = new ConsumerThread(sharedQueue);
		
		producerThread.start();
		consumerThread.start();
		
		producerThread.join();
		consumerThread.join();	
	}

}
