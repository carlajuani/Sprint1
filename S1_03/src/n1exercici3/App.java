
package n1exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import n2exercici1.Input;


/* Donat el fitxer countries.txt (revisa l'apartat recursos) que conté països i capitals. El programa ha de llegir el fitxer i 
 * guardar les dades en un HashMap<String, String>. El programa demana el nom de l’usuari/ària, i després ha de mostrar un país 
 * de forma aleatòria, guardat en el HashMap. Es tracta de què l’usuari/ària ha d’escriure el nom de la capital del país en qüestió. 
 * Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria, 
 * llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació. */

public class App {

	public static void main(String[] args){
		
		/**we create a Hashmap with 2Strings objects by setting a bufferedReader from a fileReader from an existing file txt, 
		*then with readLine method we separate the two Strings available in two variables, country and capital,
		*and finally we put them as an object with key Country and Value Capital in the HashMap and close the buffer streaming
		*when the line is empty ("", we set it up backwards because we need the comparing primitive to be read in Java and not
		*in the txt code line). 
		*The Reader requires to be wrapped with a TryCatch structure as it throws FileNotFound and IO exceptions
		**/
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
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException ex) {
			System.out.print("IOException");
		}
		
		/** We create a new array of objects with the keySet of the Hashmap.
		 * We create a variable with a String scanner personalized with the class Input(previous exercise) 
		 * with the name of the player. 
		 * We set up number of rounds and score in int variables and a new ArrayList where to put the played countries
		 * for the purpose of not repeating them in the same game. We also create an int randomizer Random variable as
		 * an index for the Array to choose a different country each round. The for has a boolean method to check for 
		 * repeated countries, embedded in a while to randomize until repeated is false (statistically improbable
		 * to repeat more than once in the same round but this way we make sure either way, specially if we want to 
		 * increase the number of rounds in the future).
		 * Once we check, we add it to the list of countries played in a string and ask the capital with a string scanner.
		 * Finally we compare the standardized strings (through a method) ScanneredString answer, and the value (capital) 
		 * that corresponds with the key played(country) to increase the score.
		 * Once the all the rounds played we print the score*/
		Object[] countriesToPlay = countriesAndCapitals.keySet().toArray();
		String inputName = Input.scanningForString("Please introduce your name"); 
		int numRounds = 10;
		int score = 0; 
		Random r = new Random();
		ArrayList<Object> countriesPlayed = new ArrayList<Object>();
		for (int i = 0; i<numRounds ; i++) {
			Object countryToPlay = countriesToPlay[r.nextInt(countriesToPlay.length)];
			boolean repeatedCountry = hasBeenPlayed(countryToPlay, countriesPlayed);
			while (repeatedCountry) {
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
		
		/** We construct the String line we want to write on the file Ranking.txt, and we create a buffered writer from
		 * a file writer with the existing file (the true in the constructor). Then we use the static method write,
		 * we set up a new line (method) for the next time to start one line below, and close the buffer, all wrapped
		 * in a tryCatch structure in case it throws IOException if there is no file to be found */
		String scoreToRanking = inputName+ "\t\t" +score+ "pts";
		try {
			FileWriter rankingUpdate = new FileWriter ("C:/Users/carla/git/Sprint1/S1_03/src/n1exercici3/Ranking.txt", true);
			BufferedWriter rankingUpdateBr = new BufferedWriter (rankingUpdate);
			rankingUpdateBr.write(scoreToRanking);
			rankingUpdateBr.newLine();
			rankingUpdateBr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//method boolean to check through the ArrayList of countries if the randomized chosen one is repeated
	static boolean hasBeenPlayed (Object country, ArrayList<Object> countriesPlayed) {
		boolean found = false;
		int i = 0;
		while (!found && i<countriesPlayed.size()) {
			if (country.equals(countriesPlayed.get(i))) {
				found = true;
			}
			i++;
		}
		return found;
	}
	
	//method to standardize Strings to match the 'usual format' for answers, ignoring cases and with spaces between words
	static String standardizeWord (String word) {
		word = word.toLowerCase().replaceAll("_", " ");
		return word;
	}
}
