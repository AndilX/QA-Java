package pair.returntype;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testGetString() {
		Message testMessage = new Message() ;
		assertEquals("String does not match","Hello World!",testMessage.getString());
	}

}