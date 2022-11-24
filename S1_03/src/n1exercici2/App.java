package n1exercici2;

import java.util.*;
import java.util.ListIterator;

/* Crea i emplena un List<Integer>. 
Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 
Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println("First list: " +intList);
		
		List<Integer> intList2 = new ArrayList<Integer>();
		ListIterator<Integer> it = intList.listIterator(intList.size());
		while (it.hasPrevious()) {
				intList2.add(it.previous());
		}
		System.out.println("Second list: " +intList2);
	}
}
