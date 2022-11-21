package n2exercici1.java;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//instanciem objecte classe Smartphone
	Smartphone smartphone1 = new Smartphone ("ZTE70");
	
	//cridem mètode call des de l'objecte amb paràmetre string
	smartphone1.call("605482661");
	//cridem mètodes static de la classe Smartphone
	smartphone1.photograph();
	smartphone1.alarm();
	}

}
