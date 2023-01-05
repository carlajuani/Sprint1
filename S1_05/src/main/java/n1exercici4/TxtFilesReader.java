package n1exercici4;
/* Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola. */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class TxtFilesReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortBranchedDirectory(args[0]);
		//"C:/Users/carla/git/Sprint1/S1_05/src/main"
	}
	
	public static void sortBranchedDirectory(String args) {
		File directory = new File(args);
		File[] directoryList = directory.listFiles();
		Arrays.sort(directoryList);
		SimpleDateFormat dateFormat = new SimpleDateFormat ("MM/dd/yyyy HH:mm:ss");
		for (File file : directoryList) {
			String fileToPrint = file.getName() +" " +file.getAbsolutePath()+ " " +dateFormat.format(file.lastModified());
			if (file.isDirectory()) {
				writeInTxtFile("(D) " +fileToPrint);
				String path = file.getAbsolutePath();
				sortBranchedDirectory(path);
			}else {	
				writeInTxtFile("(F) " +fileToPrint);
			}
		}
		printTxt("C:/Users/carla/git/Sprint1/S1_05/src/main/resources/BranchedDirectory.txt"); //FALTA CONSULTAR EXERCICI 3 DELS COUNTRIES
	}
	
	//Print line by line in the txt file. (It doesn't erase the previous)
	public static void writeInTxtFile (String line) {
		try {
			FileWriter fileUpdate = new FileWriter ("C:/Users/carla/git/Sprint1/S1_05/src/main/resources/BranchedDirectory.txt", true);
			BufferedWriter fileUpdateBr = new BufferedWriter (fileUpdate);
			fileUpdateBr.write(line);
			fileUpdateBr.newLine();
			fileUpdateBr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void printTxt (String filePath) {
		System.out.println();
	}

}
