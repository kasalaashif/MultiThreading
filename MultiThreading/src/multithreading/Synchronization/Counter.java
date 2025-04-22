package multithreading.Synchronization;

public class Counter {
	public static int count;

	public synchronized void increment() {
		// TODO Auto-generated method stub
		count++;
	}
	public int getCount()
	{
		return count;
	}

}
