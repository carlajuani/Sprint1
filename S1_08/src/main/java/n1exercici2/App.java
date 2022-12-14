package n1exercici2;
/* Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings que a més de contenir 
 * la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		/*We create a list of strings and a second empty list, and in the second we create a stream with the first and filter it with the strings
		 * that meet the 2 conditions, containing an o, and having more than length 5, and collect it into a list again and print it*/
		List<String> listComplete = Arrays.asList("Cosa","Marmota","Volatil","Cova","Cirera","Valor","Blau");
		List<String> listWithO = new ArrayList<>();
		listWithO = listComplete.stream().filter(word -> word.contains("o") && word.length()>5).collect(Collectors.toList());
		System.out.println(listWithO);
	}

}
