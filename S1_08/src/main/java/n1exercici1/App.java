package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

/* A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. 
 * Imprimeix el resultat. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listComplete = Arrays.asList("Cosa","Marmota","Volatil","Cova","Cirera","Valor","Blau");
		List<String> listWithO = new ArrayList<>();
		listWithO = listComplete.stream().filter(word -> word.contains("o")).collect(Collectors.toList());
		System.out.println(listWithO);
	}
}
