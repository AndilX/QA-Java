package pp.conditionals;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void test() {
		Operation testOperation = new Operation();
		assertEquals("Output not correct",testOperation.method(2,3,true),5);
		assertEquals("Output not correct",testOperation.method(2,3,false),6);
	}

}
