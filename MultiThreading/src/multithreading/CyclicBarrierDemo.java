package multithreading;
import java.util.concurrent.CyclicBarrier;
public class CyclicBarrierDemo {

	public static void main(String[] args) {
		
		CyclicBarrier barrier = new CyclicBarrier(3,()->{
			System.out.println("This is a barrier bitch");
		});
		
		Thread thread1 = new Thread(new CyclicBarrierExample(barrier),"thread1");
		Thread thread2 = new Thread(new CyclicBarrierExample(barrier),"thread2");
		Thread thread3 = new Thread(new CyclicBarrierExample(barrier),"thread3");
		Thread thread4 = new Thread(new CyclicBarrierExample(barrier),"thread4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
