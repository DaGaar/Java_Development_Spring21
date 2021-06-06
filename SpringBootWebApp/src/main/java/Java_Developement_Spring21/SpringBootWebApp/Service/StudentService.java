package Java_Developement_Spring21.SpringBootWebApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Java_Developement_Spring21.SpringBootWebApp.DAO.StudentDAO;
import Java_Developement_Spring21.SpringBootWebApp.Model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	
	

	public List<Student> findAll() {
		return studentDAO.findAll();
	}


	public Student saveAndFlush(Student student) {
		return studentDAO.saveAndFlush(student);
		
	}
}
