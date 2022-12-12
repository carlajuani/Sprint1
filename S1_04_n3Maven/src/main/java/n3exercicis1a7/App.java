package n3exercicis1a7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	//exercicis 1 i 2
	public static Object[] object1 = {"Horse", 23, 'A'};
	public static Object[] object2 = object1;
	public static Object[] object3 = {"Horse", 23, 'A'};
	public static Object[] object4 = {"Horse", 23, 'B'};
	
	//exercicis 3 i 4
	public static ArrayList<Integer> intList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	public static ArrayList<Integer> intList2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	public static ArrayList<Object> objList1 = new ArrayList<Object>(Arrays.asList(intList1, 10, "ten"));
	
	//exercici 5
	public static Map<Integer, String> createMap () {
		Map<Integer, String> objMap1 = new HashMap<>();	
		objMap1.put(1,"one");
		objMap1.put(2,"two");
		objMap1.put(3,"three");
		objMap1.put(4,"four");
		return objMap1;
	}
	
	//exercici 6
	public static void methodForTesting() {		
		int[] numsList = new int[2];
		numsList[0] = 1;
		numsList[1] = 0;
		numsList[2] = 4;
		numsList[3] = 6; 
	}
	
	//exercici7
	public static Optional<String> optionalObject = Optional.empty();
}
