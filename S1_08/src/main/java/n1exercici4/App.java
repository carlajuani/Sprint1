package n1exercici4;
/* Fer la mateixa impressió del punt anterior, però mitjançant method reference.  */

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> yearRoundMonths = Arrays
				.asList("January","February","March","April","May","June","July","August","September","October","November","December");
		yearRoundMonths.stream().forEach(System.out::println);
	}
}
