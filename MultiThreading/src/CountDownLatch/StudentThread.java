package CountDownLatch;

public class StudentThread extends Thread {
	OnlineExamination onlineExamination;
	
	public StudentThread(OnlineExamination onlineExamination) {
		this.onlineExamination = onlineExamination;
	}
	
	public void run() {
		onlineExamination.startExam();
	}
}
