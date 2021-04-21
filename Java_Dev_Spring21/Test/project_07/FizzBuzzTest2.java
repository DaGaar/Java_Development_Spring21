package project_07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FizzBuzzTest2 {
	
	//STATIC OBJECTS AAND VARS
	static FizzBuzz c0 = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		c0 = new FizzBuzz();
	}

	@Test
	void fizzBuzzSingle_GivenInt_ShouldReturnString() {
		assertEquals(c0.fizzBuzzSingle(1), "buzzfizz");
		assertEquals(c0.fizzBuzzSingle(3), "fizz");
		assertEquals(c0.fizzBuzzSingle(10), "buzz");
		assertEquals(c0.fizzBuzzSingle(15), "fizzbuzz");
	}
	
	@Test
	void fizzBuzzLoop_GivenInt_ShouldReturnStringArray() {
		String[] expectString = new String[] {"buzzfizz", "buzzfizz", 
				"fizz", "buzzfizz", "buzz"};		

		assertArrayEquals(c0.fizzBuzzLoop(5), expectString);	
	}

}