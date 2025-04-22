package raceCondition;

public class Counter {
	
	static int count = 0;
	
	public synchronized void increment() {
		count++;
	}
}
