package multithreading;
import java.util.concurrent.atomic.AtomicInteger;

public class SumTask implements Runnable {
	private int start;
	private int end;
	private AtomicInteger totalSum;
	private int[] nums;

	SumTask(int start, int end, int[] nums, AtomicInteger totalSum)
	{
		this.start=start;
		this.end=end;
		this.totalSum=totalSum;
		this.nums=nums;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i = start; i<end;i++)
		{
			sum+=nums[i];
		}
		System.out.println(sum);
		totalSum.addAndGet(sum);
	}

}
