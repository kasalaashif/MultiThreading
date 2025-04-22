package PrinterAccessSimulationUsingSemaphores;

public class PrintController {
	public static void main(String[] args) {
		Printer printer = new Printer();
		for(int i = 0; i < 10; i++) {
			Employee emp = new Employee(printer);
			emp.start();
		}
	}
}
