package n1exercici1;

public class OnlineWorker extends Worker{
	private final int COSTINTERNET;
	
	public OnlineWorker (String name, String surname, int hourlySalary) {
		super(name, surname, hourlySalary);
		COSTINTERNET = 30;
	}
	
	@Override
	public int calculateMonthlySalary (int hoursWorked) {
		return super.calculateMonthlySalary(hoursWorked)+COSTINTERNET;
	}
}
