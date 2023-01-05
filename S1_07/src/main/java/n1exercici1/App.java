package n1exercici1;
/* Crea una jerarquia d’objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.
La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el nombre
 d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de sobreescriure, emprant @Override. 
Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació 
@Override. 
En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores 
treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més el 
valor d'un atribut static anomenat benzina que afegirem en aquesta classe.
En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. 
A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la 
tarifa plana d'Internet, que serà una constant de la classe TreballadorOnline. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*we create 3 kinds of workers and call the same method, the 2 lasts ones are overrided methods from the
		 * generic worker method, that change the result with the same input numbers */
		Worker genericWorker = new Worker ("PersonsName", "PersonsSurname", 16);
		OnlineWorker onlineWorker = new OnlineWorker ("JosepMaria", "Puigdenvalls", 16);
		OnsiteWorker onsiteWorker = new OnsiteWorker ("Florencia", "Casamajor", 16);
		System.out.println(genericWorker.calculateMonthlySalary(140)+ "€ for a generic worker");
		System.out.println(onsiteWorker.calculateMonthlySalary(140)+ "€ for an onsite worker");
		System.out.println(onlineWorker.calculateMonthlySalary(140)+ "€ for an online worker");	
	}

}
