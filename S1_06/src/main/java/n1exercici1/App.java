package n1exercici1;
/* Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, juntament 
 * amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres. 
 * Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.*/

public class App {

	public static void main(String[] args) {
		String name1 = "Holi1";
		String name2 = "Holi2";
		String name3 = "Holi3";
		/*We create objects NoGenericMethods, scrambling the order as paramethers to check it runs eitherway, because 
		 * Java doesn't know which is which, just reads them as the same kind of exchangable objects */
		NoGenericMethods firstNGM = new NoGenericMethods (name3, name1, name2);
		NoGenericMethods secondNGM = new NoGenericMethods (name1, name2, name3);
		System.out.print(firstNGM +"\n"+ secondNGM);
	}
}
