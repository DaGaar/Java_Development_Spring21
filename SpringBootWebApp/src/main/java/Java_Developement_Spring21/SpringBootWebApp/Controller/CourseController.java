package Java_Developement_Spring21.SpringBootWebApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Java_Developement_Spring21.SpringBootWebApp.DAO.CourseDAO;

@RestController
public class CourseController {
	
	@Autowired
	CourseDAO courseDAO;
	
	@RequestMapping("/course")
	public String course() {
		return "Course Page";
	}
	

}
