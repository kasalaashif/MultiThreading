package raceCondition;

public class MyThread extends Thread {
	public final Counter counter;
	public MyThread(Counter counter) {
		this.counter = counter;
	}
	public void run() {
		try {
			for(int i = 0; i < 1000; i++) {
				counter.increment();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
