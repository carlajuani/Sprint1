package n1exercici1;

import java.io.File;
import java.util.Arrays;
/*Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre. */
public class DirectorySorted {

	public static void main(String[] args) {		
		File directory = new File(args[0]);
		//"C:/Users/carla/git/Sprint1/S1_05/src/main"
		String[] archivesList = directory.list();
		Arrays.sort(archivesList);
		
		for (int i = 0; i<archivesList.length; i++) {
			System.out.println(archivesList[i]);
		}
	}
}
