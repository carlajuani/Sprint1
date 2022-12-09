package n2exercici1;
/* Defineix un Matcher personalitzat per a Hamcrest que proporcioni el Matcher de longitud per a un String.
Volem usar la classe ->FeatureMatcher.
Amb FeatureMatcher podem ajustar un Matcher existent, decidir quin camp de l'Objecte prova ha de coincidir i 
proporcionar un missatge d'error agradable. El constructor de FeatureMatcher té els següents arguments en aquest ordre:
    El matcher que volem embolicar.
    Una descripció de la funció que provem.
    Una descripció del possible mismatch (desajustament).
L'únic mètode que hem de sobreescriure és featureValueOf (T actual), que retorna el valor que es passarà al mètode 
match () / matchesSafely (). Utilitza el seu comparador personalitzat en una prova per a comprovar si la cadena "Mordor" 
té una longitud de 8. Ajusta la prova si és necessari. */

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;


class HamcrestTest {

	public static Matcher<String> length(Matcher<? super Integer> matcher) {
	    FeatureMatcher<String, Integer> featureMatcher = new FeatureMatcher<>(matcher,
	            "a String of length that", "length") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	            return actual.length();
	        }
	    };
		return featureMatcher;
	}
	
	@Test
	public void testStringLength () {
		assertThat("Mordor", length(is(8)));
	}
}


