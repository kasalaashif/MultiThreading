package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class ExamThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CountDownLatch latch = new CountDownLatch(3);
		OnlineExamination onlineExamination = new OnlineExamination(latch);
		onlineExamination.setExam("Multi Threading");
		
		Thread student1 = new StudentThread(onlineExamination);
		Thread student2= new StudentThread(onlineExamination);
		Thread student3 = new StudentThread(onlineExamination);
		Thread student4 = new StudentThread(onlineExamination);
		
		System.out.println("Main Thread Before Students start the Examination");
		student1.start();
		student2.start();
		student3.start();
		student4.start(); // Dont wait for the fourth student since CountDownLatch is 3
		latch.await();
		System.out.println("Main Thread After Students started the Examination");
		
	}

}
