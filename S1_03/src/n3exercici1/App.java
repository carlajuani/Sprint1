package n3exercici1;
/* Crea una aplicació capaç de llegir un fitxer CSV. Aquest fitxer té 3 camps: nom, cognom i DNI, per cada registre. 
 * Es tracta d’ordenar les persones llegides del fitxer, mitjançant el seu nom, cognom o DNI. 
 * Pots fer servir la llista que creguis més adient.*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import n2exercici1.Input;

public class App {

	public static void main(String[] args) {
		//we create a new list with Persona class objects and call a method to read and introduce 
		//csv data as objects in the list 
		ArrayList<Persona> people = new ArrayList<>(); 
		castCsvFileToArrayList(people);
		
		//menu to add new objects Persona to the array or print the list in different orders
		boolean exit=false;
	    do
	    {
	      System.out.println("\n1.New person");
	      System.out.println("2.Show people's list with name A-Z");
	      System.out.println("3.Show people's list with name Z-A");
	      System.out.println("4.Show people's list with surname A-Z");
	      System.out.println("5.Show people's list with surname Z-A");
	      System.out.println("6.Show people's list with dni 1-9");
	      System.out.println("7.Show people's list with dni 9-1");
	      System.out.println("0.Exit\n");
	      int selectedOption = Input.scanningForInt("Please select an option number from the menu:");
	      switch(selectedOption)
	      {
	       case 1: //Introduir persona
	    	   addPerson(people);
	    	   break;
	    	   
	       case 2: //Mostrar les persones ordenades per nom (A-Z) 
	    	   //Collections method sort with ArrayList and personalized comparator by name
	    	   Collections.sort(people, comparatorName);
	    	   System.out.println(people);
	    	   break;
	    	   
	       case 3: //Mostrar les persones ordenades per nom (Z-A)
	    	   //Collections method sort with ArrayList and personalized comparator by name with reversed method
	    	   Collections.sort(people, comparatorName.reversed());
	    	   System.out.println(people);
	    	   break;
	    	   
		   case 4: //Mostrar les persones ordenades per cognoms (A-Z)
			   Collections.sort(people, comparatorSurname);
	    	   System.out.println(people);
	    	   break;
	    	   
		   case 5: //Mostrar les persones ordenades per cognoms (Z-A)
			   Collections.sort(people, comparatorSurname.reversed());
	    	   System.out.println(people);
	    	   break;
	    	   
		   case 6: //Mostrar les persones ordenades per DNI (1-9)
			   Collections.sort(people, comparatorDni);
	    	   System.out.println(people);
			   break;
	    	   
		   case 7: //Mostrar les persones ordenades per DNI (9-1)
			   Collections.sort(people, comparatorDni.reversed());
			   System.out.println(people);
			   break;

	       case 0:
	    	   exit=true;
	    	   System.out.println("Goodbye, come back soon!");
	    	   break;
	       	  }
	      }while(!exit);
	}
	
	/*method to read the file with a bufferedReader and split in attributes the lines to create a new Persona 
	 * and add it to the list for each line. The Reader requires to be wrapped with a TryCatch structure as it 
	 * throws FileNotFound and IO exceptions*/
	static ArrayList<Persona> castCsvFileToArrayList (ArrayList<Persona> people) {
		try {
			File peopleFile = new File ("C:/Users/carla/git/Sprint1/S1_03/src/n3exercici1/peopleList.csv");
			FileReader fr = new FileReader (peopleFile);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				String[] attributes = line.split(",");
				String name = attributes[0];
				String surname = attributes[1];
				String dni = attributes[2];
				people.add(new Persona(name, surname, dni));
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException ex) {
			System.out.print("IOException");
		}
		return people;
	}
	
	//method to scanner the attributes and add a new created Persona to the arrayList
	static ArrayList<Persona> addPerson (ArrayList<Persona> people) { 
		String name = Input.scanningForString("Please introduce first name");
		String surname = Input.scanningForString("Please introduce surname/s");
		String dni = Input.scanningForString("Please introduce dni");
		people.add(new Persona(name, surname, dni));
		return people;
	}
	
	//personalized comparator for the attribute Name
	static Comparator<Persona> comparatorName = new Comparator<> () {
		public int compare(Persona p1, Persona p2) {
			int comparatorName = p2.getName().compareTo(p1.getName());
			int result = 0;
			if (comparatorName > 0) {
				result = -1;
			} else {
				result = 1;
			}
			return result;
		}
	};
	
	//personalized comparator for the attribute Surname
	static Comparator<Persona> comparatorSurname = new Comparator<> () {
		public int compare(Persona p1, Persona p2) {
			int comparatorSurname = p2.getSurname().compareTo(p1.getSurname());
			int result = 0;
			if (comparatorSurname > 0) {
				result = -1;
			} else {
				result = 1;
			}
			return result;
		}
	};
	
	//personalized comparator for the attribute Dni
	static Comparator<Persona> comparatorDni = new Comparator<> () {
		public int compare(Persona p1, Persona p2) {
			int comparatorDni = p2.getDni().compareTo(p1.getDni());
			int result = 0;
			if (comparatorDni > 0) {
				result = -1;
			} else {
				result = 1;
			}
			return result;
		}
	};
}
