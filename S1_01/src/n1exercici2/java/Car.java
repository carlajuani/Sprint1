package n1exercici2.java;

public class Car {
	
	private static final String BRAND;
	private static String model;
	private final int power;
	
	static {
		BRAND = "Citröen";
		model = "Twingo";
	}
	
	public Car (int power) {
		this.power = power;
	}

	public Car () {
		this.power = 330;
	}
	
	//getters
	public static String getBrand () {
		return BRAND;
	}
	
	public static String getModel () {
		return model;	
	}
	
	public int getPower () {
		return power;
	}
	
	//setters
	public static void setModel (String modelSetted) {
		model = modelSetted;
	}
	
	//mètodes propis
	public static void brake () {
		System.out.println("The vehicle is braking");
	}
	
	public void speedUp () {
		System.out.println("The vehicle is speeding up");
	}
	
	public String toString() {
		return "\nBrand: " +BRAND+ "\n"+ "Model: " +model+ "\n"+ "Power: " +power+ "CC\n";
	}
}
