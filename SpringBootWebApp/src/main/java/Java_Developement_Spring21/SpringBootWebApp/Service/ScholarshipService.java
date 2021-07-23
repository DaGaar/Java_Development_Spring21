package Java_Developement_Spring21.SpringBootWebApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Exception.ResourceNotFoundException;
import Java_Developement_Spring21.SpringBootWebApp.DAO.ScholarshipDAO;
import Java_Developement_Spring21.SpringBootWebApp.Model.Scholarship;
import Java_Developement_Spring21.SpringBootWebApp.Model.Student;

@Service
public class ScholarshipService {

	@Autowired
	private ScholarshipDAO scholarshipDAO;
	
	public List<Scholarship> findAll() {
		return scholarshipDAO.findAll();
	}
	
	public Scholarship findById(Long id) {
		return scholarshipDAO.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(
						"Scholarship not found with id: " + id));
	}
}
