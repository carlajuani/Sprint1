package n1exercici7;
/* Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta. */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		/*We create a ints and Strings list. Then a second list with a stream of the first, filter only the strings with a lambda, sorting them
		 * with their length with another lambda containing a compare method, and collect it into a list. To reverse the order of the elements,
		 * we use the Collections class method reverse with the Stringlist. Then we create a third list for the 
		 * numbers, filtering the stream from the original list again now for ints and collect it. Lastly, we create the last list with the
		 * Stream class method concat and concatenate the streams of the StringList and the IntsList, and collect it all into a whole list to print*/
		List<Object> scrambledList = Arrays.asList(67,"February","Hello",0,"EggNog"," ","ChristmasHolidays",3,"One",492);
		List<Object> sortedStringList = scrambledList.stream()
											   .filter(object -> object instanceof String)
											   .sorted((a, b) -> Integer.compare(((String) a).length(), ((String) b).length()))
											   .collect(Collectors.toList());	
		Collections.reverse(sortedStringList);
		List<Object> numbersList = scrambledList.stream()
											   .filter(object -> object instanceof Integer)
											   .collect(Collectors.toList());
		List<Object> sortedList = Stream.concat(numbersList.stream(), sortedStringList.stream()).collect(Collectors.toList());
		System.out.println(sortedList);

	}

}
