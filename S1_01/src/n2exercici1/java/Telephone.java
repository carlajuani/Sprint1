package n2exercici1.java;

public class Telephone {
	
	private String brand;
	private String model;
	
	public Telephone (String model) {
		brand = "Telefònica";
		this.model = model;
	}
	
	public void call (String phoneNumber) {
		System.out.println("Call to number " +phoneNumber+ " on course");
	}
}
