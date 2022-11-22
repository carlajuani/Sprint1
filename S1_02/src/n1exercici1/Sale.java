package n1exercici1;

import java.util.ArrayList;

public class Sale {
	private ArrayList<Product> shoppingList;
	private float priceTotal;
	
	public Sale () {
		shoppingList = new ArrayList<Product>();
		priceTotal = 0f;
	}
	
	public ArrayList<Product> getShoppingList () {
		return this.shoppingList;
	}
	
	public float getPriceTotal () {
		return this.priceTotal;
	}
	
	public void addProduct (Product product) {
		shoppingList.add(product);
	}
	
	public void calcTotal() throws EmptySaleException {
		if (shoppingList.size() == 0) {
			throw new EmptySaleException("To make a sale you must add a product first");
		} else {
			for (int i = 0; i < shoppingList.size(); i++) {
				priceTotal += shoppingList.get(i).getPrice();
			}
			priceTotal = (Math.round(priceTotal*100))/100;
			System.out.println("Total: " +priceTotal+ "€\n");
		}
	}
	
	public String toString () {
		String list = "";
		for (int i = 0; i<shoppingList.size(); i++) {
			list += shoppingList.get(i).toString();
		}
		return list;
	}
}
