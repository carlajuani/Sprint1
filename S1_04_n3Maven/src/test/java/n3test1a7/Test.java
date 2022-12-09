package n3test1a7;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.ThrowableAssert.ThrowingCallable;

import n3exercicis1a7.App;

class Test {
	/**
	 * tests exercici 1
	 * Asserció que demostri que el valor de dos objectes sencers és igual, i una que indiqui que no ho és.
	 */
	public void equalObjectsValues() {
		assertThat(App.object3).isEqualTo(App.object1);
	}
	
	public void notEqualObjectsValues() {
		assertThat(App.object1).isNotEqualTo(App.object4);
	}
	
	/**
	 * tests exercici 2
	 * Asserció que demostri que la referència a un objecte és la mateixa que una altra, i una que indiqui que és diferent.
	 */
	public void equalObjectsHashCodes() {
		assertThat(App.object1).hasSameHashCodeAs(App.object2);
	}
	
	public void notEqualObjectsHashCodes() {
		assertThat(App.object1).doesNotHaveSameHashCodeAs(App.object3);
	}
	
	/**
	 * test exercici 3
	 * Una asserció que indiqui que dos arrays d'enters són idèntics.
	 */
	public void equalIntArrays() {
		assertThat(App.intList1).isEqualTo(App.intList2);
	}
	
	/**
	 * test exercici 4
	 * Crea un arrayList contenidor de diversos tipus d'objectes (crea'ls també). 
 * 		Escriu una asserció per a verificar l'ordre dels objectes en l'ArrayList segons han estat inserits.
    	Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
    	Verifica que, en la llista anterior, un dels objectes s'ha afegit només una vegada. 
    	Deixa un dels elements sense afegir, i verifica que la llista no conté aquest últim.
	 */
	public void orderIsCorrect() {
		assertThat(App.objList1).containsExactly(App.intList1, 10, "ten");
	}
	
	public void containsAll() {
		assertThat(App.objList1).contains( "ten", App.intList1, 10);
	}
	
	public void containsOnlyOneOf() {
		assertThat(App.objList1).containsOnlyOnce(10);
	}
	
	public void doesNotContain() {
		assertThat(App.objList1).doesNotContain("hola");
	}
	
	/**
	 * test exercici 5
	 * Crea un map i verifica que conté una de les key que li afegeix.
	 */
	public void mapHasKey() {
		assertThat(App.objMap1).containsKey(3);
	}
	
	/**
	 * test exercici 6
	 * Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol. Crea una asserció que validi 
 * 	   que l'excepció és llançada quan correspon.
	 */
	public void throwsCorrectlyAnException() {
		assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(new ThrowingCallable() {
			@Override
			public void call() throws Throwable {
				App.methodForTesting();
			}
		});
	}
	
	/**
	 * test exercici 7
	 Crea un objecte Optional buit. Escriu l'asserció correcta per a verificar que efectivament està buit.
	 */
	public void isEmpty() {
		assertThat(App.optionalObject).isEmpty();
	}
	
	
	
	
	

}
