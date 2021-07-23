package Java_Developement_Spring21.SpringBootWebApp.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CourseTest {

	//STATIC VARS
	static Course c1 = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c1 = new Course(); 
	}

	@Test
	void setId_GivenLong_ShouldReturnLong() {
		Long id = 431L;
		c1.setId(id);;
		assertEquals(c1.getId(), id);
	}

	@Test
	void setName_GivenString_ShouldReturnString() {
		String str = "Any 'ol star wars movie";
		c1.setName(str);
		assertEquals(c1.getName(), str);
	}

}
