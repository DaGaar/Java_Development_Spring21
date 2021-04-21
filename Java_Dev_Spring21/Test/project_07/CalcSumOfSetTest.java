package project_07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalcSumOfSetTest {
	
	//STATIC OBJECTS AND VARS
	static CalcSumOfSet c0 = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		c0 = new CalcSumOfSet();
	}

	@Test
	void sumOfSet_GivenIntArray_ShouldReturnInt() {
		int[] testNums = new int[] {3, 10, 9, 0, 12};
		assertEquals(c0.sumOfSet(testNums), 34);
	}

}
