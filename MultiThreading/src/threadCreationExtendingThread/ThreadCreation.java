package threadCreationExtendingThread;

public class ThreadCreation extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendThread thread = new ExtendThread();
		
		thread.start();
	}

}
