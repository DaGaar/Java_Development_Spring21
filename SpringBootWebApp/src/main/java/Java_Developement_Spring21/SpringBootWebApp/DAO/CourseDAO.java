package Java_Developement_Spring21.SpringBootWebApp.DAO;

import org.springframework.data.repository.CrudRepository;

import Java_Developement_Spring21.SpringBootWebApp.Model.Course;

public interface CourseDAO extends CrudRepository<Course, Long> {

}
