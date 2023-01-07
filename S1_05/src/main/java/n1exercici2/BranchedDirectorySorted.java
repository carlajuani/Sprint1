package n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
/* Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el contingut 
 * de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada 
 * nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació. */

public class BranchedDirectorySorted {

	public static void main(String[] args) {
		//we call the method to sort and print the directories and files with the console's first argument as path
		sortBranchedDirectory(args[0]);
	}
	
	/*method to create a new file with the path args, list the files into a string array, creating a simpledateformat to print the date 
	 * in the files standardized, and with a forEach loop we create a String with the name, path and formatted last modified date. If the file
	 * is a directory, we print a D and the string, and call the method again with it's path to access and print the files within, if is a simple
	 * file, we print it directly with a F.	*/
	public static void sortBranchedDirectory (String args) {
		File directory = new File(args);
		File[] directoryList = directory.listFiles();
		Arrays.sort(directoryList);
		SimpleDateFormat dateFormat = new SimpleDateFormat ("MM/dd/yyyy HH:mm:ss");
		for (File file : directoryList) {
			String fileToPrint = file.getName() +" " +file.getAbsolutePath()+ " " +dateFormat.format(file.lastModified());
			if (file.isDirectory()) {
				System.out.println("(D) " +fileToPrint);
				String path = file.getAbsolutePath();
				sortBranchedDirectory(path);
			}else {	
				System.out.println("(F) " +fileToPrint);
			}
		}
	}
}
