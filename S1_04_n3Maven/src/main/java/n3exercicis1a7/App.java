package n3exercicis1a7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

/*  */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objMap1.put(1,"one");
		objMap1.put(2,"two");
		objMap1.put(3,"three");
		objMap1.put(4,"four");
	}
	
	public static Object[] object1 = {"Horse", 23, 'A'};
	public static Object[] object2 = object1;
	public static Object[] object3 = {"Horse", 23, 'A'};
	public static Object[] object4 = {"Horse", 23, 'B'};
	
	public static ArrayList<Integer> intList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	public static ArrayList<Integer> intList2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	
	public static ArrayList<Object> objList1 = new ArrayList<Object>(Arrays.asList(intList1, 10, "ten"));
	
	public static HashMap<Integer, String> objMap1 = new HashMap<>();
	
	public static Optional<String> optionalObject = Optional.empty();
	
	public static void methodForTesting() {		
		ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(1,0,4));
		numsList.get(3);
	}
}
