package n3exercici1;

import java.util.*;

import n2exercici1.Input;
import n3exercici1.Cinema.IncorrectRowException;

/* Contindrà un ArrayList de butaques i els mètodes necessaris per afegir, eliminar i cercar les butaques a l’ArrayList.
Mètodes:
    *afegirButaca
    *eliminarButaca: 
    *cercarButaca:  */

public class SeatManager {
	private ArrayList<Seat> reservedSeats;
	
	public SeatManager () {
		this.reservedSeats = new ArrayList<Seat>();
	}

	public ArrayList<Seat> getSeatsList() {
		return reservedSeats;
	}
	
	public void addSeat (int rowNumber, int seatNumber, String reservationName) {
		try {
			int seatsIndex = findSeatsIndex(rowNumber, seatNumber);
			if (seatsIndex == -1) {
				reservedSeats.add(new Seat (rowNumber, seatNumber, reservationName));
				System.out.println("The seat reservation was completed succesfully");
			} else {
				throw new OccupiedSeatException();
			}
        } catch (OccupiedSeatException ex) {
        	System.out.println("ERROR. This seat already does have a reservation\n");
        }
	}
	
	public void removeSeat (int rowNumber, int seatNumber){
		try {
			int seatsIndex = findSeatsIndex(rowNumber, seatNumber);
			if (seatsIndex == -1) {
				throw new FreeSeatException();
			} else {
				reservedSeats.remove(seatsIndex);
				System.out.println("The seat reservation was removed succesfully");
			}
        } catch (FreeSeatException ex) {
        	System.out.println("ERROR. This seat already does not have a reservation\n");
        }
	}
	
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
	
	//nova classe seient ja ocupat extends Exception
	public class OccupiedSeatException extends Exception {
		public OccupiedSeatException () {
			super();
		}
	}
		
	//nova classe seient ja lliure extends Exception
	public class FreeSeatException extends Exception {
		public FreeSeatException () {
			super();
		}
	}
}
