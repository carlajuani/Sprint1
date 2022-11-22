package n1exercici1.java;

public class BrassInstrument extends Instrument {
		
	{
		name = "flute";
		price = 30.0;
	}
	
	public BrassInstrument () {
		super();
	}

	public void play () {
		String message = "A " +name+ " is playing";
		System.out.println(message);
	}
	
	@Override
	public String toString() {
		return "BrassInstrument [name=" + name + ", price=" + price + "]";
	}
}
