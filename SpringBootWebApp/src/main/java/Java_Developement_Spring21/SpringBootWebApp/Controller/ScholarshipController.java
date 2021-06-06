package Java_Developement_Spring21.SpringBootWebApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Java_Developement_Spring21.SpringBootWebApp.Service.ScholarshipService;

@Controller
@RequestMapping("api/v1")
public class ScholarshipController {
	
	@Autowired
	private ScholarshipService scholarshipService;

	@GetMapping("scholarship")
	private String getScholarships() {
		return "scholarship.html";
	}
}
