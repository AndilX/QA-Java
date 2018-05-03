package testIfFor;

import static org.junit.Assert.*;

import org.junit.Test;

import pp.iffor.IfFor;

public class testConditions {

	@Test
	public void testGetter() {
			IfFor testIfFor = new IfFor(0, 0, false, false);
			assertEquals("Getter number is not correct",testIfFor.getNumber(),0);
			assertEquals("Getter range is not correct",testIfFor.getRange(),0);
			assertFalse("Getter check1 is true ",testIfFor.getCheck1());
			assertFalse("Getter check2 is true",testIfFor.getCheck2());
			
			IfFor testIfFor2 = new IfFor(5, 10, true, true);
			assertEquals("Getter number is not correct",testIfFor2.getNumber(),5);
			assertEquals("Getter range is not correct",testIfFor2.getRange(),10);
			assertTrue("Getter check1 is false",testIfFor2.getCheck1());
			assertTrue("Getter check2 is false",testIfFor2.getCheck2());
	}
	
	@Test
	public void testMethod() {
		
			IfFor testMethod = new IfFor(0, 0, true, true);
			testMethod.updateNumber();
			assertEquals("Incorrect range value",testMethod.getRange(),10);
			assertEquals("Incorrect number value",testMethod.getNumber(),20);
			
			IfFor testMethod2 = new IfFor(0, 0, true, false);
			testMethod2.updateNumber();
			assertEquals("Incorrect range value",testMethod2.getRange(),5);
			assertEquals("Incorrect number value",testMethod2.getNumber(),10);
			
			IfFor testMethod3 = new IfFor(0, 0, false, true);
			testMethod3.updateNumber();
			assertEquals("Incorrect range value",testMethod3.getRange(),5);
			assertEquals("Incorrect number value",testMethod3.getNumber(),10);
			
			IfFor testMethod4 = new IfFor(0, 0, false, false);
			testMethod4.updateNumber();
			assertEquals("Incorrect range value",testMethod4.getRange(),2);
			assertEquals("Incorrect number value",testMethod4.getNumber(),4);
			
	}

}
