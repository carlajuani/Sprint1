package n1exercici4;
/* Fer la mateixa impressió del punt anterior, però mitjançant method reference.  */

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//we create a list of strings, convert it into a stream, using the method forEach with a method reference to print every element of the list
		List<String> yearRoundMonths = Arrays
				.asList("January","February","March","April","May","June","July","August","September","October","November","December");
		yearRoundMonths.stream().forEach(System.out::println);
	}
}
