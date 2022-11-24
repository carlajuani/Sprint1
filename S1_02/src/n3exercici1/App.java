package n3exercici1;
/* Una famosa empresa de cinemes ens ha demanat que desenvolupem una aplicació per a la reserva de seients en els seus cinemes. 
 * L’aplicació serà utilitzada pels venedors/es a l’hora de vendre les entrades.
L’aplicació un cop s’hagi iniciat, preguntarà a l’usuari/ària quantes files i quants seients per fila té la sala de cinema. 
Un cop introduïdes aquestes dades, es mostrarà el següent menú:

1.- Mostrar totes les butaques reservades.
2.- Mostrar les butaques reservades per una persona.
3.- Reservar una butaca.
4.- Anul·lar la reserva d’una butaca.
5.- Anul·lar totes les reserves d’una persona.
0.- Sortir. */

import java.util.*;
import n2exercici1.Input;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cinema cinemas = new Cinema();
		
	    boolean exit=false;
	    do
	    {
	      
	      System.out.println("0.Exit\n");
	      int selectedOption = Input.scanningForInt("Please select an option number from the menu:");
	      switch(selectedOption)
	      {
	       case 0:
	    	   exit=true;
	    	   System.out.println("Goodbye, come back soon!");
	    	   break;
	       	  }
	      }while(!exit);
	}

}
