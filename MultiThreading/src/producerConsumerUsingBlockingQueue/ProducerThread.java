package producerConsumerUsingBlockingQueue;

public class ProducerThread extends Thread{
	SharedBlockingQueue sharedQueue;
	
	public ProducerThread(SharedBlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	
	public void run() {
		try {
			while(true){
				sharedQueue.produce();
				Thread.sleep(10);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
