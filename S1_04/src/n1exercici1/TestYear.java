package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestYear {

	@Test
	final void testSize() {
		assertEquals(12, App.year().size());
	}
	
	@Test
	final void testNotEmpty() {
		assertNotNull(App.year().size());
	}
	
	@Test
	final void testPosition () {
		assertEquals("August", App.year().get(7));
	}
	
	

}
