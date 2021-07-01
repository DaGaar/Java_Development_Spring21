package Java_Developement_Spring21.SpringBootWebApp.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Java_Developement_Spring21.SpringBootWebApp.DAO.StudentDAO;
import Java_Developement_Spring21.SpringBootWebApp.Model.Instructor;
import Java_Developement_Spring21.SpringBootWebApp.Model.Student;
import Java_Developement_Spring21.SpringBootWebApp.Service.StudentService;
//import Java_Developement_Spring21.SpringBootWebApp.Service.CourseService;

//@Controller
//public class StudentController {
	
	//MEM VARS
//	private final StudentService studentService;
	

	
//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}
	
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/students")
	public List<Student> getStudents() {
		return studentService.findAll();
	}
	
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	// PUT REQUEST IS USED TO MODIFY AN EXISTING RECORD
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
		
		// STEP ONE: RETRIEVE STUDENT RECORD FROM THE DB USING ID
		Student student = studentService.findById(id);
		
		// STEP TWO: UPDATE RETRIEVED STUDENT WITH NEW STUDENT DETAILS
		student.setName(studentDetails.getName());
		student.setEmail(studentDetails.getEmail());
		student.setDob(studentDetails.getDob());
		student.setAge(studentDetails.getAge());
		
		//STEP THREE: SAVE THE MODIFIED STUDENT RECORD TO THE DB
		Student updatedStudent = studentService.save(student);
		
		//RETURN A RESPONSE CONTAINING OK AND THE UPDATED STUDENT RECORD
		return ResponseEntity.ok(updatedStudent);
	}
	
}
	//@Autowired
	//private CourseService courseService;
	
//	@GetMapping("studentForm")
//	public String studentForm() {
//		return "student.html";
//	}
//	
//	@GetMapping("students")
//	public String getStudents(Model model) {
//		List<Student> students = studentService.findAll();
//		model.addAttribute("students", students);
//		return "student-list.html";
//	}
//	
//	@GetMapping("addStudent")
//	public String addStudent(Student student) {
//		studentService.saveAndFlush(student);
//	//	System.out.println("Saving..." + student);
//		return "student.html";
//	}
	
//	@GetMapping
//	public List<Student> getStudents() {
//		return studentService.getStudents();
//	}
//}
