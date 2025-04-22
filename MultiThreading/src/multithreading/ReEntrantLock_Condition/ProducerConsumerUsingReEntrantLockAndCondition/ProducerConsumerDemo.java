package multithreading.ReEntrantLock_Condition.ProducerConsumerUsingReEntrantLockAndCondition;

public class ProducerConsumerDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ProducerConsumerGenerator producerConsumerGenerator = new ProducerConsumerGenerator(5);
		
		Thread producer = new Thread(()->
		{
			while(true)
			{
				producerConsumerGenerator.producer();
			}
		},"producer");
		
		Thread consumer = new Thread(()->
		{
			while(true)
			{
				producerConsumerGenerator.consumer();
			}
		},"consumer");
		
		producer.start();
		consumer.start();
	}

}
