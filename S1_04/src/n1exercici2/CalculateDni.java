package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;

/* Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
   Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre de dades ampli 
   i validi si el càlcul és correcte per a 10 números de DNI predefinits.*/

public class CalculateDni {
	
	public static char calcDni (String numbers) {
		//per conservar el 0 inicial entrem numbers com a String i després castejem a int amb un valueOf
		int standardizedNumbers = Integer.valueOf(numbers);
		ArrayList<Character> lettersList = new ArrayList<>();
		lettersList.addAll(Arrays.asList('T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'));
		char correctLetter = lettersList.get(standardizedNumbers%23);
		return correctLetter;
	}
}
