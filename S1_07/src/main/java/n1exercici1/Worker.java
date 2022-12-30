package n1exercici1;

public abstract class Worker {
	protected String name;
	protected String surname;
	protected int hourlySalary;

	public Worker (String name, String surname, int hourlySalary) {
		this.name = name;
		this.surname = surname;
		this.hourlySalary = hourlySalary;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", surname=" + surname + ", hourlySalary=" + hourlySalary + "€/h]";
	}
	
	public int calculateMonthlySalary (int hoursWorked) {
		return hoursWorked*hourlySalary;
	}
}
