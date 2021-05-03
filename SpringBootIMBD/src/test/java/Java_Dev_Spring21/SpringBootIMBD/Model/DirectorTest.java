package Java_Dev_Spring21.SpringBootIMBD.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DirectorTest {
	
	// STATIC VARS
	static Director s = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s = new Director ( "Ben",
							"Stiller",
							54
				);
	}

	@Test
	void movieConstructor_GivenMovie_ShouldReturnMovie() {
		assertEquals(s, s);
	}
}