package cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player extends Thread{
	CyclicBarrier barrier;
	public Player(CyclicBarrier barrier) {
		// TODO Auto-generated constructor stub
		this.barrier = barrier;
	}
	
	public void run() {
		try {
			System.out.println("Players are waiting"+ Thread.currentThread().getName());
			barrier.await();
			System.out.println("Players started running" + Thread.currentThread().getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
