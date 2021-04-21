package project_07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CompareArraysTest {

	//STATIC OBJECTS AND VARS
	static CompareArrays c0 = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		c0 = new CompareArrays();
	}

	@Test
	void compareArrays_GivenTwoIntArrays_ShouldReturnIntArray() {
		int[] a1 = new int[] {3, 5, 1, 6};
		int[] a2 = new int[] {8, 4, 1, 7};
		int[] expectTally = new int[] {1, 2};
		
		assertArrayEquals(c0.compareArrays(a1, a2), expectTally);
	}

}
