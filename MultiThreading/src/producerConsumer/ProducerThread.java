package producerConsumer;

public class ProducerThread extends Thread{
	SharedQueue sharedQueue;
	
	public ProducerThread(SharedQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	
	public void run() {
		try {
			while(true) {
				sharedQueue.produce();
				Thread.sleep(10);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
