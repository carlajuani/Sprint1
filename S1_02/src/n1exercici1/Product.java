package n1exercici1;

public class Product {
	private String name;
	private float price;
	
	public Product (String name, float price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName () {
		return this.name;
	}
	
	public float getPrice () {
		return this.price;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setPrice (float price) {
		this.price = price;
	}
	
	public String toString () {
		String product = this.name +" " +price+ "€\n";
		return product;
	}
}
