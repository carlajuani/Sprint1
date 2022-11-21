package n1exercici2.java;

public class Car {
	
	private static final String brand;
	private static String model;
	private final int power;
	
	static {
		brand = "Citröen";
		model = "Twingo";
	}
	
	{
		power = 330;
	}
	
	public Car () {
	}
	
	//canviem el valor de propietat model amb el constructor per evidenciar que no és final, es pot variar, tant amb constructor com amb setter
	public Car (String model) {
		model = "Twango";
	}
	
	//getters
	public static String getBrand () {
		return brand;
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
		return "\nBrand: " +brand+ "\n"+ "Model: " +model+ "\n"+ "Power: " +power+ "CC\n";
	}
}
