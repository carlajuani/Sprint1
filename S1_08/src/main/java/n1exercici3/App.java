package n1exercici3;
/* Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda. */

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//we create a list of strings, convert it into a stream, using the method forEach with a lambda expression to print every element of the list
		List<String> yearRoundMonths = Arrays
				.asList("January","February","March","April","May","June","July","August","September","October","November","December");
		yearRoundMonths.stream().forEach(month -> System.out.println(month));
	}

}
