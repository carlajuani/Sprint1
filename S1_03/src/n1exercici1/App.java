package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any). 
 * Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, a excepció de l'objecte amb atribut "Agost". 
 * Després, efectua la inserció en el lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte.

Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.
Recorre la llista amb un for i amb un iterador. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Month> year = new ArrayList<Month>();
		year.add(new Month("January"));
		year.add(new Month("February"));
		year.add(new Month("March"));
		year.add(new Month("April"));
		year.add(new Month("May"));
		year.add(new Month("June"));
		year.add(new Month("July"));
		year.add(new Month("September"));
		year.add(new Month("October"));
		year.add(new Month("November"));
		year.add(new Month("December"));
		year.add(7, new Month("August"));
		System.out.println("This is the print of the arrayList with August implemented last in its place (TOTAL MONTHS " +year.size()+ "):\n" +year+ "\n");
		
		Set <Month> yearSet = new HashSet<Month>(year);
		yearSet.add(new Month("November"));
		System.out.println("This is the print of the HashSet without the repeated addition of November (TOTAL MONTHS " +yearSet.size()+ "):\n" +yearSet+ "\n");
		
		System.out.println("This is the iterator print of the HashSet:");
		Iterator <Month> it = yearSet.iterator();
		int printCounter = 0;
		while (it.hasNext()) {
			System.out.println(it.next());
			printCounter += 1;
		}
		System.out.println("TOTAL MONTHS: " +printCounter+ "\n");
		
		System.out.println("\nThis is the for loop print of the HashSet:");
		printCounter = 0;
		for (Month month : yearSet) {
			System.out.println(month);
			printCounter += 1;
		}
		System.out.println("TOTAL MONTHS: " +printCounter);
	}

}
