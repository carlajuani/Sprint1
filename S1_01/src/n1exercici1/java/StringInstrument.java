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
		super.play("string");
	}
}
