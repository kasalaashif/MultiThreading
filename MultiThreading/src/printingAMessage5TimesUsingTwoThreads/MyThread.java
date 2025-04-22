package printingAMessage5TimesUsingTwoThreads;

public class MyThread extends Thread{
	
	public void run() {
			try {
				for(int i = 0; i < 5; i++) {
					System.out.println("This is MyThread created by extending Thread");
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

