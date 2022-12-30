package n3exercici1;

public class Generic {
	
	public static <T extends Telephone> void genericCall (T a) {
		a.call();
	}
	
	public static <T extends Smartphone> void genericPhotograph (T b) {
		b.photograph();
	}
}
