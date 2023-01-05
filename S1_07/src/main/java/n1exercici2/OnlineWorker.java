package n1exercici2;
import n1exercici1.Worker;

public class OnlineWorker extends Worker {
	private final int COSTINTERNET;
	
	public OnlineWorker (String name, String surname, int hourlySalary) {
		super(name, surname, hourlySalary);
		COSTINTERNET = 30;
	}
	
	@Override
	public int calculateMonthlySalary (int hoursWorked) {
		return super.calculateMonthlySalary(hoursWorked)+COSTINTERNET;
	}
	
	@Deprecated
	public void deprecatedMethod () {
		System.out.println("This is a deprecated method");
	}
}
