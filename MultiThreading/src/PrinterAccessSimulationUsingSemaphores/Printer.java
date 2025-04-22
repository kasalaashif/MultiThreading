package PrinterAccessSimulationUsingSemaphores;

import java.util.concurrent.Semaphore;

public class Printer {
	Semaphore semaphore = new Semaphore(3);
	
	public void print() throws InterruptedException {
		semaphore.acquire();
		try {
			System.out.println("Printing Started by: " + Thread.currentThread().getName());
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			semaphore.release();
		}
	}
}
