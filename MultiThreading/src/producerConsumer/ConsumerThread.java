package producerConsumer;

public class ConsumerThread extends Thread{
	SharedQueue sharedQueue;
	
	public ConsumerThread(SharedQueue sharedQueue) {
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
