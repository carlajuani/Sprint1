package n1exercici2.java;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciem nou objecte de classe Car
		Car car1 = new Car ();
		//accedim per imprimir a les propietats static a través dels getter de la classe Car
		System.out.println(Car.getBrand());
		System.out.println(Car.getModel());
		//accedim per imprimir a la propietat no static a través del getter de l'objecte instanciat
		System.out.println(car1.getPower());
		//canviem la propietat model amb el setter static de la classe Car, i imprimim amb el toString, o podriem tornar a agafar-lo amb el getter static
		Car.setModel("Thong");
		System.out.println(car1.toString());
		//accedim per imprimir als mètodes brake que és static a través de la classe, i speedUp que és propi de l'objecte car1
		Car.brake();
		car1.speedUp();
	}

}
