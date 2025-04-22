package threadLifeCycle;

public class MainThread {
	
	//	State | Meaning
	//	NEW | Thread object is created but start() is not called yet
	//	RUNNABLE | Thread is ready to run and waiting for CPU time
	//	RUNNING | Thread is currently executing its task
	//	BLOCKED | Thread is waiting to acquire a lock held by another thread
	//	WAITING / TIMED_WAITING | Thread is waiting (e.g., via wait(), join(), sleep())
	//	TERMINATED | Thread has finished execution or exited due to an exception


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new MyThread());
		System.out.println(thread.getState());
		thread.start();
		System.out.println(thread.getState());
		Thread.sleep(1000);
		System.out.println(thread.getState());
		thread.join();
		System.out.println(thread.getState());
	}

}
