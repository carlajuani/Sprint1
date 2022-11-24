package n3exercici1;
/* Tindrà les dades d’una butaca:
Atributs:
    Nombre de fila.
    Nombre de seient.
    Persona que reserva la butaca.
Mètodes:
    Constructor amb tots els paràmetres.
    Getters per tots els atributs.
    Equals: retornarà que dues butaques són iguales si la fila i el seient són iguals.
    toString: retornarà un String amb el següent format: “Fila: 5, Seient: 20, Persona: Maria Febrer”
 */

public class Seat {
	private int rowNumber;
	private int seatNumber;
	private String reservationName;
	
	public Seat (int rowNumber, int seatNumber, String reservationName) {
		this.rowNumber = rowNumber;
		this.seatNumber = seatNumber;
		this.reservationName = reservationName;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public String getReservationName() {
		return reservationName;
	}
	
	public boolean equals(Seat seat2) {
		boolean areEquals = false;
		if (this.rowNumber == seat2.getRowNumber() && this.seatNumber == seat2.getSeatNumber()) {
			areEquals = true;
		}
		return areEquals;
	}

	@Override
	public String toString() {
		return "Row: " + rowNumber + ", Seat: " + seatNumber + ", Reservation name: " + reservationName+ "\n";
	}
	
}
