package n1exercici1.java;

public class StringInstrument extends Instrument {
	
	{
		name = "guitar";
		price = 50.0;
	}
	
	public StringInstrument () {
		super();
	}
	
	public void play () {
		String message = "A " +name+ " is playing";
		System.out.println(message);
	}
}
