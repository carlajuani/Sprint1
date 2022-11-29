package n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;

/* Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
   Verifica el seu correcte funcionament amb un test jUnit.*/
public class App {
	public static void main (String[] args) {
	}
	
	public static void methodForTesting(int index) {		
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.addAll(Arrays.asList(1,0,4,6));
		System.out.println(numsList.get(index));
	}
}

