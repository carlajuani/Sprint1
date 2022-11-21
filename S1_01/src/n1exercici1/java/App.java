package n1exercici1.java;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciem objecte flute de classe filla BrassInstr amb block d'inicialització i constructor heredat
		BrassInstrument flute = new BrassInstrument ();
		flute.play();
		
		//Instanciem objecte bassDrum de classe filla PercussionInstr amb constructor per paràmetres heredat
		PercussionInstrument bassDrum = new PercussionInstrument ("drum bass", 30.0);
		bassDrum.play();
		
		//Instanciem objecte electricG de classe filla StringInstr amb block d'inicialització i constructor heredat
		StringInstrument electricGuitar = new StringInstrument ();
		electricGuitar.play();
		
	}

}
