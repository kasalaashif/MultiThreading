package multithreading;

public class SemaphoreMain {
	public static void main(String[] args)
	{
		SemaphoreExample sem1= new SemaphoreExample();
		SemaphoreExample sem2= new SemaphoreExample();
		SemaphoreExample sem3= new SemaphoreExample();
		Thread thread1 = new Thread(sem1,"Thread1");
		Thread thread2 = new Thread(sem2,"Thread2");
		Thread thread3 = new Thread(sem3,"Thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
