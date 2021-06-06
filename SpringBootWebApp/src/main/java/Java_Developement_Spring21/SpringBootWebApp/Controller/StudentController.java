package Java_Developement_Spring21.SpringBootWebApp.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import Java_Developement_Spring21.SpringBootWebApp.DAO.StudentDAO;
import Java_Developement_Spring21.SpringBootWebApp.Model.Instructor;
import Java_Developement_Spring21.SpringBootWebApp.Model.Student;
import Java_Developement_Spring21.SpringBootWebApp.Service.StudentService;

//@Controller
//public class StudentController {
	
	//MEM VARS
//	private final StudentService studentService;
	

	
//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}
	
@Controller
@RequestMapping("api/v1")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("studentForm")
	public String studentForm() {
		return "student.html";
	}
	
	@GetMapping("students")
	public String getStudents(Model model) {
		List<Student> students = studentService.findAll();
		model.addAttribute("students", students);
		return "student-list.html";
	}
	
	@GetMapping("addStudent")
	public String addStudent(Student student) {
		studentService.saveAndFlush(student);
	//	System.out.println("Saving..." + student);
		return "student.html";
	}
}
	
//	@GetMapping
//	public List<Student> getStudents() {
//		return studentService.getStudents();
//	}
//}
