package Java_Developement_Spring21.SpringBootWebApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Java_Developement_Spring21.SpringBootWebApp.DAO.ScholarshipDAO;

@Service
public class ScholarshipService {

	@Autowired
	private ScholarshipDAO scholarshipDAO;
}
