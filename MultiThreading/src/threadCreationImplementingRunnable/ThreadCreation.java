package threadCreationImplementingRunnable;

public class ThreadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new ImplementsRunnable());
		thread.start();

	}

}
