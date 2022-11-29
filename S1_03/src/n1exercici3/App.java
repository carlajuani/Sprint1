
package n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

import n2exercici1.Input;


/* Donat el fitxer countries.txt (revisa l'apartat recursos) que conté països i capitals. El programa ha de llegir el fitxer i 
 * guardar les dades en un HashMap<String, String>. El programa demana el nom de l’usuari/ària, i després ha de mostrar un país 
 * de forma aleatòria, guardat en el HashMap. Es tracta de què l’usuari/ària ha d’escriure el nom de la capital del país en qüestió. 
 * Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria, 
 * llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació. */

public class App {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		HashMap<String, String> countriesAndCapitals= new HashMap<String, String>();
		try {
			File countries = new File ("C:/Users/carla/git/Sprint1/S1_03/src/n1exercici3/countries.txt");
			FileReader fr = new FileReader (countries);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(!"".equals(line)) {
				String[] countryAndCapital = line.split(" ");
				String country = countryAndCapital[0].trim();
				String capital = countryAndCapital[1].trim();
				countriesAndCapitals.put(country, capital);
				line = br.readLine();
			}
			System.out.println(countriesAndCapitals);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException ex) {
			System.out.print("IOException");
		}
		
		Object[] countriesToPlay = countriesAndCapitals.keySet().toArray();
		String inputName = Input.scanningForString("Please introduce your name");
		int numRounds = 10;
		int score = 0;
		Random r = new Random();
		ArrayList<Object> countriesPlayed = new ArrayList<Object>();
		for (int i = 0; i<numRounds ; i++) {
			Object countryToPlay = countriesToPlay[r.nextInt(countriesToPlay.length)];
			boolean repeatedCountry = hasBeenPlayed(countryToPlay, countriesPlayed);
			System.out.println(repeatedCountry);
			if (repeatedCountry) {
				countryToPlay = countriesToPlay[r.nextInt(countriesToPlay.length)];
				repeatedCountry = hasBeenPlayed(countryToPlay, countriesPlayed);
			}
			countriesPlayed.add(countryToPlay.toString());
			String answer= Input.scanningForString("What is the capital of " +countryToPlay+ "?");
			if (standardizeWord(answer).equals(standardizeWord(countriesAndCapitals.get(countryToPlay)))) {
				score++;
				System.out.println("Correct!");
			}
		}	
		System.out.println(inputName+ ": Your score is " +score+ "pts");
		
		String scoreToRanking = inputName+ " Score: " +score+ "pts";
		
	}
	
	static boolean hasBeenPlayed (Object country, ArrayList<Object> countriesPlayed) {
		boolean found = false;
		int i = 0;
		while (!found || i<countriesPlayed.size()) {
			if (country.toString().equals(countriesPlayed.get(i))) {
				found = true;
			}
			i++;
		}
		return found;
	}
	
	static String standardizeWord (String word) {
		word = word.toLowerCase().replaceAll("_", " ");
		return word;
	}
	
//falta arreglar el comprovador de repetits i afegir el txt amb scores (video 153 pildores informaticas
}
