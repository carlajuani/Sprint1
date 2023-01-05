package n1exercici2;
/* Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. 
 * Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent 
 * els “warnings” per ser obsolets. */

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* We create 2 workers and call 2 methods with the Deprecated annotation, and add a SupressWarnings annotation
		 * to our main method to suppress the warnings from Java for using them anyway*/
		OnlineWorker onlineWorker = new OnlineWorker ("JosepMaria", "Puigdenvalls", 16);
		OnsiteWorker onsiteWorker = new OnsiteWorker ("Florencia", "Casamajor", 16);
		onlineWorker.deprecatedMethod();
		onsiteWorker.deprecatedMethod();
	}

}
