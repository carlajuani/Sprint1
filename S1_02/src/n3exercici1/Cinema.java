package n3exercici1;

import java.util.*;
import n2exercici1.Input;

/* Contindrà tots els mètodes que permeten interactuar a l’usuari/ària amb l’aplicació.
Atributs:
    *Nombre de files del cinema.
    *Nombre de seients per cada fila.
    *Un objecte de la classe GestioButaques
Mètodes:
    *Constructor: 
    *iniciar: 
    *menu: 
    *mostrarButaques: 
    *mostrarButaquesPersona:
    *reservarButaca: 
    *anularReserva: 
    *anularReservaPersona:
    *introduirPersona:
    *demanarDadesInicials: 
    *introduirFila: 
    *introduirSeient:
 */
public class Cinema {
	private int numberOfRows;
	private int seatsForRow;
	private SeatManager seatManager;
	
	public Cinema () {
		this.askInitialData();
		this.seatManager = new SeatManager();
	}
	
	public void askInitialData () {
		this.numberOfRows = Input.scanningForInt("Please indicate the number of rows of the Cinema");
		this.seatsForRow = Input.scanningForInt("Please indicate the number of seats for each row");
	}
	
	public void initializeApp () {
		boolean exit=false;
		do 
		{
		 int selectedOption = menu();
		 switch(selectedOption)
	     {
	      case 1: //mostrarButaques: 
	    	  showAllReservedSeats();  
	    	  break;
	    	   
	      case 2: //mostrarButaquesPersona: 
	    	  showCostumersReservation();
	    	  break;
	    	   
	      case 3: //reservarButaca
	    	  seatReservation();
	    	  break;
	    	   
		  case 4: //anularReserva
	    	  cancelSeatReservation();
			  break;
	
		  case 5: //anularReservaPersona: 
	    	  cancelPersonReservations();
			  break;
	
	      case 0:
	    	  exit=true;
	    	  System.out.println("Goodbye, come back soon!");
	    	  break;
		      }
		} while(!exit);
	}
	
	public int menu () {
		System.out.println("\n1.Show all seat reservations");
	    System.out.println("2.Show costumer's seat reservations");
	    System.out.println("3.Seat reservation");
	    System.out.println("4.Cancel seat reservation");
	    System.out.println("5.Cancel costumer's seat reservations");
	    System.out.println("0.Exit\n");
	    int selectedOption = Input.scanningForInt("Please select an option number from the menu:");
		return selectedOption;
	}
	
	public void showAllReservedSeats () {
		System.out.print(seatManager.getSeatsList());
	}
	
	public void showCostumersReservation () {
		String reservationName = introducePerson();
		System.out.println("Reservations for " +reservationName+ ":");
		for (int i = 0; i < seatManager.getSeatsList().size(); i++) {
			if (reservationName.equalsIgnoreCase(seatManager.getSeatsList().get(i).getReservationName())) {
				System.out.print(seatManager.getSeatsList().get(i));
			}
		}
	}
	
	public void seatReservation () {
		seatManager.addSeat(introduceRowNumber(), introduceSeatNumber(), introducePerson()); 
	}
	
	public void cancelSeatReservation () {
		seatManager.removeSeat(introduceRowNumber(), introduceSeatNumber()); 
	}
	
	public void cancelPersonReservations() {
		String reservationsName = introducePerson();
		int seatsCancelled = 0;
		Iterator <Seat> it = seatManager.getSeatsList().iterator();
		while (it.hasNext()) {
			Seat currentSeat = it.next();
			if (currentSeat.getReservationName().equals(reservationsName)) {
				seatManager.removeSeat(currentSeat.getRowNumber(),currentSeat.getSeatNumber());
				seatsCancelled++;
			}
		}
		System.out.println(seatsCancelled+ " seat reservations from " +reservationsName+ " have been cancelled");
	}
	
	public int introduceRowNumber () {
		int inputRow = 0;
	    boolean correct = false;
	    do {
	        try {
	        	inputRow = Input.scanningForInt("Please introduce the row number");
	        	if (inputRow < 1 || inputRow > this.numberOfRows) {
	        		correct = false;
	        		throw new IncorrectRowException();
	        	} else {
	        		correct = true;
	        	}
	        } catch (IncorrectRowException ex) {
	        	System.out.println("ERROR. Please introduce a number between 1 and " +numberOfRows+ "\n");
	        }
	    } while (!correct);
	    return inputRow;
	}
	
	public int introduceSeatNumber () {
		int inputSeat = 0;
	    boolean correct = false;
	    do {
	        try {
	        	inputSeat = Input.scanningForInt("Please introduce the seat number");
	        	if (inputSeat < 1 || inputSeat > this.seatsForRow) {
	        		correct = false;
	        		throw new IncorrectRowException();
	        	} else {
	        		correct = true;
	        	}
	        } catch (IncorrectRowException ex) {
	        	System.out.println("ERROR. Please introduce a number between 1 and " +seatsForRow+ "\n");
	        }
	    } while (!correct);
	    return inputSeat;
	}
	
	public String introducePerson () {
		String inputName = "";
	    boolean correct = false;
	    Scanner setName = new Scanner(System.in);
	    do {
	        System.out.println("Please introduce the name for the reservation");
	        try {
	        	inputName = setName.nextLine();
	        	correct = true;
	        	char[] splitName = inputName.toCharArray();
	    		for (char unit : splitName) {
	    			if (Character.isDigit(unit)) {
	    				correct = false;
	    				throw new IncorrectNameException();
	    			}
	    		}	        	
	        } catch (IncorrectNameException ex) {
	        	System.out.println("ERROR. The name cannot contain any numbers\n");
	        }
	    } while (!correct);		
		return inputName;
	}
	
	//nova classe fila incorrecte extends Exception
	public class IncorrectRowException extends Exception {
		public IncorrectRowException () {
			super();
		}
	}
	
	//nova classe seient incorrecte extends Exception
	public class IncorrectSeatException extends Exception {
		public IncorrectSeatException () {
			super();
		}
	}
	
	//nova classe nom incorrecte extends Exception
	public class IncorrectNameException extends Exception {
		public IncorrectNameException () {
			super();
		}
	}
}
