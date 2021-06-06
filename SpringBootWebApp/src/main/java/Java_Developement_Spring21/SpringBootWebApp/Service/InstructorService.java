package Java_Developement_Spring21.SpringBootWebApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import Java_Developement_Spring21.SpringBootWebApp.DAO.InstructorDAO;
import Java_Developement_Spring21.SpringBootWebApp.Model.Instructor;

@Service
public class InstructorService {
	
	@Autowired
	private InstructorDAO instructorDAO;

	public List<Instructor> findAll() {
		return instructorDAO.findAll();
	}

//	public List<Instructor> getInstructors() {
//		
//	}
}
