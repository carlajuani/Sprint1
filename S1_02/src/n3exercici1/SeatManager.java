package n3exercici1;

import java.util.*;

import n2exercici1.Input;

/* Contindrà un ArrayList de butaques i els mètodes necessaris per afegir, eliminar i cercar les butaques a l’ArrayList.
Mètodes:
    afegirButaca
    eliminarButaca: 
    cercarButaca:  
    
 */

public class SeatManager {
	private ArrayList<Seat> reservedSeats;
	
	public SeatManager () {
		this.reservedSeats = new ArrayList<Seat>();
	}

	public ArrayList<Seat> getSeatsList() {
		return reservedSeats;
	}
	
    //i l’afegirà a l’ArrayList. Si la fila i el seient de la butaca rebuda com a paràmetre coincideixen amb el d’una butaca 
    //que ja es trobi a l’ArrayList (s’utilitzarà el mètode cercarButaca), es llençarà l’excepció personalitzada ExcepcioButacaOcupada.
	public void addSeat (int rowNumber, int seatNumber, String reservationName) throws Exception {
		if (findSeatsIndex(rowNumber, seatNumber) != -1) {
			throw new Exception("ExceptionOccupiedSeat"); //NO ES FA AIXI HAS DE CREARLA A LA CLASSE EXCEPTION
		} else {
			reservedSeats.add(new Seat (rowNumber, seatNumber, ));	
		}
	}
	
	//serà l’encarregat d’eliminar una butaca de l’ArrayList de butaques. Rebrà com a paràmetres el número de fila i 
    //el seient i l’eliminarà de l’ArrayList. Si la fila i el seient no coincideixen amb el d’una butaca reservada (s’utilitzarà el mètode 
    //cercarButaca), llençarà una excepció personalitzada ExcepcioButacaLliure.
	public void removeSeat (int rowNumber, int seatNumber) throws Exception {
		int seatsIndex = findSeatsIndex(rowNumber, seatNumber);
		if (seatsIndex == -1) {
			throw new Exception("ExceptionFreeSeat"); //NO ES FA AIXI HAS DE CREARLA A LA CLASSE EXCEPTION
		} else {
			reservedSeats.remove(seatsIndex);
		}
	}
	
	//Cerca a l’ArrayList de butaques, la butaca que coincideixi amb les dades rebudes com a paràmetre (fila i seient).
	//Si la troba retornarà la posició de la butaca a l’ArrayList i si no la troba retornarà -1.
	public int findSeatsIndex (int rowNumber, int seatNumber){
		boolean isFound = false;
		int seatsIndex = -1;
		int i = 0;
		while (i < reservedSeats.size() && !isFound) {
			if (reservedSeats.get(i).getRowNumber() == rowNumber 
				&& reservedSeats.get(i).getSeatNumber() == seatNumber) {
				seatsIndex = i;
				isFound = true;
			}
			i++;
		}
		return seatsIndex;
	}
}
