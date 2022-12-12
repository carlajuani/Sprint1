package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestYear {

	@Test
	final void testSize() {
		//es podria fer amb assertTrue size=12 però es veu que és més eficient l'Equals
		assertEquals(12, App.year().size());
	}
	
	@Test
	final void testNotEmpty() {
		assertNotNull(App.year().size());
	}
	
	@Test
	final void testPosition () {
		int expected = 7;
		int actual = App.year().indexOf("August");
		assertEquals(expected, actual);
	}
	
	

}
