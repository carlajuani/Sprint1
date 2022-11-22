package n1exercici1;

import java.util.ArrayList;

/* Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda". 
 * Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.

La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada VendaBuidaException i 
mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. 
Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut 
preu total de la venda.

 */


public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Sale sale1 = new Sale ();
		sale1.addProduct(new Product ("apples", 2.15f));
		sale1.addProduct(new Product ("blackberries", 2.95f));
		sale1.addProduct(new Product ("wine", 6.80f));
		tryCalcTotal(sale1);
		
		Sale sale2 = new Sale ();
		tryCalcTotal(sale2);
	}
	
	static void tryCalcTotal (Sale sale) {
		try {
			System.out.println(sale.toString());
			sale.calcTotal();
	    } catch (EmptySaleException ex) {
	    	System.out.println(ex.getMessage());
	    }
	}
}
