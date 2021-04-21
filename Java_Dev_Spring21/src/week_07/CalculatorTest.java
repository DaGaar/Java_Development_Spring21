package week_07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	//STATIC OBJECTS AND VARIABLES
	static Calculator c0 = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		c0 = new Calculator();
		//c1 = new Calculator(); --good if you need to compare two separate instances of method
	}

	@Test
	//<method>_Given<what it accepts>_Should<what it returns>
	void add_GivenTwoInts_ShouldReturnInt() {
		assertEquals(c0.add(2, 2), 4);
		assertEquals(c0.add(Integer.MIN_VALUE, Integer.MAX_VALUE), -1);
		
	}
	
	@Test
	void add_ShouldReturnInt_GivenTwoStrings() {
		assertEquals(c0.add("4", "6"), 10);
	}
	
	@Test
	//<method>_Given<what it accepts>_Should<what it returns>
		void subtract_GivenTwoInts_ShouldReturnInt() {
			assertEquals(c0.subtract(2, 2), 0);
			assertEquals(c0.subtract(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);
		}
	
	@Test
	void compare_ShouldReturnBool_GivenTwoInts() {
		assertTrue(c0.compare(2, 2));
		assertEquals(c0.compare(3,  4), false);
	}

}
