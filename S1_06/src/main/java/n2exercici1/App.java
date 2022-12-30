package n2exercici1;
import n1exercici2.Person;
/* Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.*/

public class App {
	//we create a person and then call the static method from genericMethods class and print any object types
	public static void main(String[] args) {
		Person person2 = new Person ("Pepet", "deLesMuntanyes", 5);
		AlmostGenericMethods.print3Generics(person2, "HelloWorlds, again", "This needs to be a string");
	}
}
