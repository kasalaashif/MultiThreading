package threadLifeCycle;

public class MyThread extends Thread{
	
	public void run() {
			try {
				System.out.println("This is MyThread created by extending Thread");	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

