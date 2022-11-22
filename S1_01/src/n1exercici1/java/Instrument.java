package n1exercici1.java;

public abstract class Instrument {
	protected String name;
	protected double price;
	
	public Instrument () {
	}
	
	public Instrument (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName () {
		return name;
	}
	
	public double getPrice () {
		return price;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public abstract void play ();
	
	public String toString() {
		return "BrassInstrument [name=" + name + ", price=" + price + "]";
	}
}
