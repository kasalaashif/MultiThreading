package producerConsumerUsingBlockingQueue;


public class ConsumerThread extends Thread{
	SharedBlockingQueue sharedQueue;
	
	public ConsumerThread(SharedBlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	
	public void run() {
		try {
			while(true) {
				sharedQueue.consume();
				Thread.sleep(10);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

