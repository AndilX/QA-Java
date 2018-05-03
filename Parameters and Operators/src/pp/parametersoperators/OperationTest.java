package pp.parametersoperators;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void testAdd() {
		Operation testOperation = new Operation();
		assertEquals("Output is incorrect", testOperation.add(2,3), 5);
	}

}
