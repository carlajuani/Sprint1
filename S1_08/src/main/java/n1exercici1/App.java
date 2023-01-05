package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;

/* A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. 
 * Imprimeix el resultat. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listComplete = new ArrayList<>();
		listComplete.addAll(Arrays.asList("Cosa","Marmota","Cova","Cirera","Valor","Blau"));
		ArrayList<String> listWithO = new ArrayList<>();
		for (String word : listComplete) {
			if (word.contains("o")) {
				listWithO.add(word);
			} else {
				continue;
			}
		}
		System.out.println(listWithO);
	}

}
