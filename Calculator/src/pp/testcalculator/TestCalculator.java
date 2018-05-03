package pp.testcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import pp.calculator.Calculator;

public class TestCalculator {

	@Test
	public void test() {
		Calculator testCalculator = new Calculator();
		assertNotNull("The object is Null",testCalculator);
		assertEquals("Error invalid output",testCalculator.operate(15,8,'a'),23);
		assertEquals("Error invalid output",testCalculator.operate(35,7,'s'),28);
		assertEquals("Error invalid output",testCalculator.operate(5,8,'m'),40);
		assertEquals("Invalid input produces valid output", testCalculator.operate(3, 5, 'i'), 0);
	}

}
