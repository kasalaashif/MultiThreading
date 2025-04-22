package printingAMessage5TimesUsingTwoThreads;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new MyThread());		
		Thread thread2 = new Thread(new RunnableThread());
		
		thread1.start();
		thread2.start();
		
		Thread thread3 = new Thread(new MyThread());	
		Thread thread4 = new Thread(new RunnableThread());
		thread3.run();
		thread4.run();
	}

}
