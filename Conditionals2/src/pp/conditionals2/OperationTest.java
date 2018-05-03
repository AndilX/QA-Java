package pp.conditionals2;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void testMethod() {
		Operation testOperation = new Operation();
		assertEquals("Method returns incorrect value", testOperation.method(1,0), 1);
		assertEquals("Method returns incorrect value", testOperation.method(0,2), 2);
		assertEquals("Method returns incorrect value", testOperation.method(1,2), 3);
	}

}
