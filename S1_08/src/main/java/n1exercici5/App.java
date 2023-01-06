package n1exercici5;
/* Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double. Des del main() de 
 * la classe principal, instància la interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue() i imprimeix el resultat. */

public class App {

	public static void main(String[] args) {
		/*we create a functional interface object, and define its only method with a double value, with a lambda expression. Then, we print 
		 * that value calling the method in the object that returns the double value*/
		NumPi numPi = () -> 3.1416;
		System.out.println(numPi.getPiValue());
	}
	
	//we create a functional interface with a single method that has to return a double
	@FunctionalInterface
	interface NumPi {
		public double getPiValue();
	}

}
