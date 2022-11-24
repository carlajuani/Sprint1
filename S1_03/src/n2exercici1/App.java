package n2exercici1;

import java.util.HashSet;
import java.util.Set;

/* Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int). 
 * Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant amb el mateix nom
 *  i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.
Pot haver-hi restaurants amb el mateix nom amb diferent puntuació, però no pot haver-hi restaurants 
amb el mateix nom i la mateixa puntuació. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Restaurant> restaurantsRanking = new HashSet<Restaurant>();
		restaurantsRanking.add(new Restaurant ("Disfrutar", 9));
		restaurantsRanking.add(new Restaurant ("Alkimia", 8));
		restaurantsRanking.add(new Restaurant ("Dos Pebrots", 9));
		restaurantsRanking.add(new Restaurant ("Teòric", 10));
		restaurantsRanking.add(new Restaurant ("Dos Palillos", 7));
		restaurantsRanking.add(new Restaurant ("Slow&Low", 7));
		restaurantsRanking.add(new Restaurant ("Slow&Low", 9));
		restaurantsRanking.add(new Restaurant ("Slow&Low", 9));
		System.out.println(restaurantsRanking);
	}

}
