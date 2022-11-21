package n2exercici1.java;

public class Smartphone extends Telephone 
	implements Camera, Clock {
	
	public Smartphone (String model) {
		super(model);
	}
	
	public void photograph () {
		System.out.println("A photo is being taken");
	}
	
	public void alarm () {
		System.out.println("An alarm is ringing");
	}
	
}
