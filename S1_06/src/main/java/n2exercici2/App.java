package n2exercici2;
/* Modifica l'apartat anterior de manera que els arguments del mètode genèric siguin una llista d'arguments 
 * de variable indefinida. */

import n1exercici2.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We create a person and a generic list of different objects, and then we call the method to print the list
		Person person3 = new Person ("Lola", "Pepsicola", 21);
		Object[] genericsList = {person3, 11, "yet another String"};
		GenericListsMethods.printGenericsList(genericsList);
	}
}
