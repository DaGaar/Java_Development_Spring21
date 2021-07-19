package Java_Developement_Spring21.SpringBootWebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Java_Developement_Spring21.SpringBootWebApp.DAO.CourseDAO;
import Java_Developement_Spring21.SpringBootWebApp.Model.Course;
import Java_Developement_Spring21.SpringBootWebApp.Model.Student;
import Java_Developement_Spring21.SpringBootWebApp.Service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courses")
	public List<Course> getCourse() {
		return courseService.findAll();
	}
	
}
