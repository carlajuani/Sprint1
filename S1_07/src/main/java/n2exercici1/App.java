package n2exercici1;
/* Crea una anotació personalitzada que ha de permetre serialitzar un objecte Java en un fitxer JSON. 
 * L’anotació ha de rebre el directori on es col·locarà el fitxer resultant. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	@JsonSerializable(directory = "location")
	Object[] person = {"name", "surname", 36};
	}

}
