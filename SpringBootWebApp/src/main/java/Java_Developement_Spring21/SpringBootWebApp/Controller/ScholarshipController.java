package Java_Developement_Spring21.SpringBootWebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Java_Developement_Spring21.SpringBootWebApp.Model.Scholarship;
import Java_Developement_Spring21.SpringBootWebApp.Model.Student;
import Java_Developement_Spring21.SpringBootWebApp.Service.ScholarshipService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1")
public class ScholarshipController {
	
	@Autowired
	private ScholarshipService scholarshipService;

	@RequestMapping("/scholarships")
	private List<Scholarship> getScholarships() {
		return scholarshipService.findAll();
	}
	
	@GetMapping("/scholarships/{id}")
	public ResponseEntity<Scholarship> getScholarshipById(@PathVariable Long id) {
		Scholarship scholarship = scholarshipService.findById(id);
		return ResponseEntity.ok(scholarship);
	}
}
