package cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class RunningCompetition {

	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(3, new Run());
		Player p1 = new Player(barrier);
		Player p2 = new Player(barrier);
		Player p3 = new Player(barrier);
		p1.start();
		p2.start();
		p3.start();
	}
}
