package n1exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class TestExceptionApp {
	//creem un executable anònim sobrescrivint el mètode principal execute() perquè executi el nostre
	@Test
	public void test() {
		Assertions.assertThrows( IndexOutOfBoundsException.class, new Executable() {
			public void execute() throws Throwable{
				App.methodForTesting(4);
			}
		});
	}
}
