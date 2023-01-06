package n1exercici8;
/* Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de rebre i ha de retornar un String. 
 * En el main() de la classe principal, injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni 
 * la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si 
 * el resultat és correcte. */

public class App {

	public static void main(String[] args) {
		/*We create a functional interface object, and define their only method with a lambda expression, using a for loop with descending index to 
		put each char of the parameter String into another string in reversed order. Then we call the interface object method with a String to
		get printed reversed*/
		Transform transformation = (word) -> {
			String reversedWord = "";
	        for(int i = word.length()-1; i >= 0; i--)
	        	reversedWord += word.charAt(i);
	        return reversedWord;
		};
		System.out.println(transformation.reverse("Supercalifragilistic"));
	}
	
	//we create a functional interface with a single method that has to return a String and has a String as a parameter
	@FunctionalInterface
	interface Transform {
		public String reverse(String word);
	}

}
