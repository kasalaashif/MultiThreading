package printingAMessage5TimesUsingTwoThreads;

public class RunnableThread implements Runnable{
	public void run() {
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println("Thread from Runnable");
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
