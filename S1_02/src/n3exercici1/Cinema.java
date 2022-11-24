package n3exercici1;

import n2exercici1.Input;

/* Contindrà tots els mètodes que permeten interactuar a l’usuari/ària amb l’aplicació.
Atributs:
    Nombre de files del cinema.
    Nombre de seients per cada fila.
    Un objecte de la classe GestioButaques
Mètodes:
    *Constructor: no rebrà paràmetres. Crearà l’objecte de la classe GestióButaques. I cridarà al mètode demanarDadesInicials 
    que inicialitzarà el nombre de files i de seients.
    iniciar: començarà l’aplicació. Cridarà al mètode menu i en funció del número retornat, cridarà al mètode corresponent.
   * menu: mostrarà les opcions del menú principal a l’usuari/ària, li demanarà el número de l’opció escollida i el retornarà.
    mostrarButaques: 
    mostrarButaquesPersona:
    reservarButaca: 
    anularReserva: 
    anularReservaPersona:
    introduirPersona: demana a l’usuari/ària el nom de la persona i el retorna si és correcte. Si conté números, llença una excepció personalitzada ExcepcioNomPersonaIncorrecte.
    demanarDadesInicials: Demana a l’usuari/ària el nombre de files i seients i els guarda en els atributs corresponents. 
    introduirFila: Demana el nombre de fila, si aquest està entre 1 i el nombre de files totals, el retorna. Si no, retorna una excepció personalitzada ExcepcioFilaIncorrecta.
    introduirSeient: Demana el seient, si el número està entre 1 i el nombre total de seients, el retorna. Si no, retorna una excepció del tipus ExcepcioSeientIncorrecte.
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
		int selectedOption = menu();
		switch(selectedOption)
	      {
	       case 1: //mostrarButaques: Mostra totes les butaques reservades.
	    	   showAllReservedSeats();  
	    	   break;
	    	   
	       case 2: //mostrarButaquesPersona: Demana el nom de la persona que ha fet la reserva i 
	    	   //mostra totes les butaques reservades per aquesta persona.
	    	   showCostumersReservation();
	    	   break;
	    	   
	       case 3: //reservarButaca: Demana a l’usuari/ària un número de fila (crida al mètode introduirFila), un número de seient 
	    	   		//(crida al mètode introduirSeient), el nom de la persona que fa la reserva (crida al mètode introduirPersona) 
	    	   		//i reserva la butaca.
	    	   seatReservation();
	    	   break;
	    	   
		   case 4: //Cancel seat reservation
			   //anularReserva: Demana a l’usuari/ària un número de fila (crida al mètode introduirFila), un número de seient 
			   //(crida al mètode introduirSeient) i elimina la reserva de la butaca.
	    	   break;

		   case 5: //Cancel costumer's reservation
			   //anularReservaPersona: Demana a l’usuari/ària el nom de la persona (crida al mètode introduirPersona) 
			   //i elimina les butaques reservades per la persona introduïda.
	    	   break;

	       case 0:
	    	   System.out.println("Goodbye, come back soon!");
	    	   break;
	       }
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
		String reservationName = Input.scanningForString("Please indicate the name in the reservation");
		System.out.println("Reservations for " +reservationName+ ":");
		for (int i = 0; i < seatManager.getSeatsList().size(); i++) {
			if (reservationName.equalsIgnoreCase(seatManager.getSeatsList().get(i).getReservationName())) {
				System.out.println(seatManager.getSeatsList().get(i));
			}
		}
	}
	
	public void seatReservation (){
		int rowNumber = introduceRowNumber();
		int seatNumber = introduceSeatNumber();
		String reservationName = introducePerson();
		//seatManager.addSeat(rowNumber, seatNumber, reservationName); //AVIAM JAVA UN MOMENTET SIUSPLAU PERQUÈ SE M'ACUMULEN LES EXCEPTIONS JODER
	}
	
	public int introduceRowNumber () {
		/*try {
			//???????????????????????khbfskjadbnkbsdnlbindflnbdlblk
		} catch {
			
		}*/
		return 0;
	}
	
	public int introduceSeatNumber () {
		return 0;
	}
	
	//introduirPersona: demana a l’usuari/ària el nom de la persona i el retorna si és correcte. 
	//Si conté números, llença una excepció personalitzada ExcepcioNomPersonaIncorrecte.
	public String introducePerson () {
		String reservationName = Input.scanningForString("Please indicate reservation name");
		//aquí un split de string a unitats i if unitat castejada a int igual a unitat llavors throw exception?
		return reservationName;
	}
}
