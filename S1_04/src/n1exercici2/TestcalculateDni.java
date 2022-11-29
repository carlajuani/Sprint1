package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestcalculateDni {

	@ParameterizedTest
	@CsvSource({"39718459,N", "47102244,S", "23047848,P", "77364986,R", "33957834,J", "48743957,B", "34835767,J", "47963328,W", "49348296,W"})
	public void test(int numbers, char letter) {
		char correctLetter = CalculateDni.calcDni(numbers);
		assertEquals(letter, correctLetter);
	}
}
