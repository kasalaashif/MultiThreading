package PrinterAccessSimulationUsingSemaphores;

public class Employee extends Thread{
	
	Printer printer;
	
	public Employee(Printer printer) {
		this.printer = printer;
	}
	
	public void run(){
		try {
			printer.print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
