package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class OnlineExamination {
	String exam;
	CountDownLatch count = new CountDownLatch(3);
	public OnlineExamination(CountDownLatch count){
		this.count = count;
	}
	
	public String getExam() {
		return exam;
	}

	public void setExam(String exam) {
		this.exam = exam;
	}

	public void startExam() {
		System.out.println("Exam Started");
		count.countDown();
	}
	
	

}
