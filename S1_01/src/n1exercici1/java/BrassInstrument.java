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
		super.play("brass");
	}
	
	@Override
	public String toString() {
		return "BrassInstrument [name=" + name + ", price=" + price + "]";
	}
}
