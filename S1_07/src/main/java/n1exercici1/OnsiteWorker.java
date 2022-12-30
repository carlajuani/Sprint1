package n1exercici1;

public class OnsiteWorker extends Worker{
	private static int gasCost;
	
	public OnsiteWorker (String name, String surname, int hourlySalary) {
		super(name, surname, hourlySalary);
		gasCost = 60;
	}
	
	public static void setGasCost (int gasCost) {
		OnsiteWorker.gasCost = gasCost;
	}
	
	@Override
	public int calculateMonthlySalary (int hoursWorked) {
		return super.calculateMonthlySalary(hoursWorked)+gasCost;
	}
}
