package n2exercici2;

public class GenericListsMethods {
	
	public static <T> void printGenericsList (T[] genericList) {
		for (Object object : genericList) {
			System.out.println(object);	
		}
	}
}
