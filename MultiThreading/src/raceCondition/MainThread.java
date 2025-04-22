package raceCondition;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread thread1 = new MyThread(counter);
		Thread thread2 = new MyThread(counter);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println(Counter.count);
	}
}
