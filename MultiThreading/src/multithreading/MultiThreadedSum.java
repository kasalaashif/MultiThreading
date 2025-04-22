package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[100];
		for(int i=0; i<100; i++)
		{
			nums[i] = i+1;
		}
		
		int noOfThreads = 4;
		int chunkSize = nums.length/noOfThreads;
		Thread[] threads = new Thread[noOfThreads];
		AtomicInteger totalSum = new AtomicInteger(0);
		
		for(int start=0,end=chunkSize,j=0; j<noOfThreads; start=start+chunkSize,end=start+chunkSize)
		{
			threads[j] = new Thread(new SumTask(start, end,nums,totalSum));
			threads[j].start();
			j++;
		}
		for(Thread thread: threads)
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		System.out.println(totalSum.get());
	}

}
