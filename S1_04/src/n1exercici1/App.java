package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
/* Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8 conté el nom 'agost'. */

public class App {

	public static ArrayList<String> year() {
		// TODO Auto-generated method stub
		ArrayList<String> year = new ArrayList<String>();
		year.addAll(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		return year;
	}

}
