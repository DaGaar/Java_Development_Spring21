package Java_Developement_Spring21.SpringBootWebApp.Model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Java_Developement_Spring21.SpringBootWebApp.Model.Student;

class StudentTest {
	
	// STATIC VARS
	static Student s = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s = new Student (1231L, 
						"Ben Hur",
						"dundat.gmail.com",
						LocalDate.of(1966, Month.DECEMBER, 4),
						64
				);
	}

	@Test
	void getAge_GivenInt_ShouldReturnInt() {
		assertEquals(s.getAge(), 64);
	}

}
