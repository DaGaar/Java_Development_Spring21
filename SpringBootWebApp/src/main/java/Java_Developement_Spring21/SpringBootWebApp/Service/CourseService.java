package Java_Developement_Spring21.SpringBootWebApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Java_Developement_Spring21.SpringBootWebApp.DAO.CourseDAO;
import Java_Developement_Spring21.SpringBootWebApp.Model.Course;

@Service
public class CourseService {

	@Autowired
	private CourseDAO courseDAO;
	
	public List<Course> findAll() {
		List<Course> courses = courseDAO.findAll();
		return courses;
//		return courseDAO.findAll();
	}
	
}
