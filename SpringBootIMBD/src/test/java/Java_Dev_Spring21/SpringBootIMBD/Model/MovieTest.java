package Java_Dev_Spring21.SpringBootIMBD.Model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MovieTest {
	
	// STATIC VARS
	static Movie s = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s = new Movie 	(51234L,
						"Titan AE",
						"SciFi",
						LocalDate.of(1998,  8, 13),
						//new Director("Brad", "Bird", 63)
						"Brad Bird"
				);
	}

	@Test
	void movieConstructor_GivenMovie_ShouldReturnMovie() {
		assertEquals(s, s);
	}
}
