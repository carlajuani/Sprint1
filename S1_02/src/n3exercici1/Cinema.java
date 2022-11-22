package n3exercici1;
/* Contindrà tots els mètodes que permeten interactuar a l’usuari/ària amb l’aplicació.

Atributs:
    Nombre de files del cinema.
    Nombre de seients per cada fila.
    Un objecte de la classe GestioButaques

Mètodes:
    Constructor: no rebrà paràmetres. Crearà l’objecte de la classe GestióButaques. I cridarà al mètode demanarDadesInicials 
    que inicialitzarà el nombre de files i de seients.
    iniciar: començarà l’aplicació. Cridarà al mètode menu i en funció del número retornat, cridarà al mètode corresponent.
    menu: mostrarà les opcions del menú principal a l’usuari/ària, li demanarà el número de l’opció escollida i el retornarà.
    mostrarButaques: Mostra totes les butaques reservades.
    mostrarButaquesPersona: Demana el nom de la persona que ha fet la reserva i mostra totes les butaques reservades per aquesta persona.
    reservarButaca: Demana a l’usuari/ària un número de fila (crida al mètode introduirFila), un número de seient 
    (crida al mètode introduirSeient), el nom de la persona que fa la reserva (crida al mètode introduirPersona) i reserva la butaca.
    anularReserva: Demana a l’usuari/ària un número de fila (crida al mètode introduirFila), un número de seient (crida al mètode introduirSeient) i elimina la reserva de la butaca.
    anularReservaPersona: Demana a l’usuari/ària el nom de la persona (crida al mètode introduirPersona) i elimina les butaques reservades per la persona introduïda.
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
		this.seatManager = new SeatManager();
		
	}
	
	
}
