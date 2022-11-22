package n1exercici2.java;

public class Car {
	
	private static final String BRAND;
	private static String model;
	private final int POWER;
	
	static {
		BRAND = "Citröen";
		model = "Twingo";
	}
	
	{
		POWER = 330;
	}
	
	public Car () {
	}
	
	//canviem el valor de propietat model amb el constructor per evidenciar que no és final, es pot variar, tant amb constructor com amb setter
	public Car (String model) {
		model = "Twango";
	}
	
	//getters
	public static String getBrand () {
		return BRAND;
	}
	
	public static String getModel () {
		return model;	
	}
	
	public int getPower () {
		return POWER;
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
		return "\nBrand: " +BRAND+ "\n"+ "Model: " +model+ "\n"+ "Power: " +POWER+ "CC\n";
	}
}
