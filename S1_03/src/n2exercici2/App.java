package n2exercici2;
/*  */
import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Restaurant> restaurantsRanking = new HashSet<Restaurant>();
		restaurantsRanking.add(new Restaurant ("Disfrutar", 9));
		restaurantsRanking.add(new Restaurant ("Alkimia", 8));
		restaurantsRanking.add(new Restaurant ("Dos Pebrots", 9));
		restaurantsRanking.add(new Restaurant ("Teòric", 10));
		restaurantsRanking.add(new Restaurant ("Dos Palillos", 7));
		restaurantsRanking.add(new Restaurant ("Slow&Low", 7));
		restaurantsRanking.add(new Restaurant ("Slow&Low", 9));
		restaurantsRanking.add(new Restaurant ("Slow&Low", 9));
		System.out.println(restaurantsRanking);
		
		TreeSet <Restaurant> treeRanking = new TreeSet<Restaurant>(restaurantsRanking);
		System.out.println(treeRanking);
	}
}
