package n1exercici1;

import java.io.File;
import java.util.Arrays;
/*Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre. */
public class DirectorySorted {

	public static void main(String[] args) {
		/*we create a file with the path from the console's runnable first argument, then a string array with all the files, 
		 * we sort it alphabetically with the sort method and with a forEach loop we print every file name in the console*/
		File directory = new File(args[0]);
		String[] archivesList = directory.list();
		Arrays.sort(archivesList);
		
		for (String archive : archivesList) {
			System.out.println(archive);
		}
	}
}
