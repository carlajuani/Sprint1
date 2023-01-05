package n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
/* Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el contingut 
 * de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada 
 * nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació. */

public class BranchedDirectorySorted {

	public static void main(String[] args) {
		sortBranchedDirectory(args[0]);
		//"C:/Users/carla/git/Sprint1/S1_05/src/main"
	}
	
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
