package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

/* A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. 
 * Imprimeix el resultat. */

public class App {

	public static void main(String[] args) {
		/*We create a list of strings, and in a second list, we create a stream with the first list and the method filter, indicating with a 
		lambda expression that for each string we select only the ones containing o, and use collect to convert the stream into a list again
		and print it*/
		List<String> listComplete = Arrays.asList("Cosa","Marmota","Volatil","Cova","Cirera","Valor","Blau");
		List<String> listWithO = new ArrayList<>();
		listWithO = listComplete.stream().filter(word -> word.contains("o")).collect(Collectors.toList());
		System.out.println(listWithO);
	}
}
