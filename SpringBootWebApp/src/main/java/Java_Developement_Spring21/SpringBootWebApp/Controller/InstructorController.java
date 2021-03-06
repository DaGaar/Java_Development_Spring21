package Java_Developement_Spring21.SpringBootWebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Java_Developement_Spring21.SpringBootWebApp.DAO.InstructorDAO;
import Java_Developement_Spring21.SpringBootWebApp.Model.Instructor;
import Java_Developement_Spring21.SpringBootWebApp.Service.InstructorService;

//@RestController  //Responds with json data, not a "view" (.html)
@Controller
@RequestMapping("api/v1")
public class InstructorController {

	
	@Autowired
	private InstructorService instructorService;
	
	@GetMapping("instructors")
	public String getInstructors(Model model) {
		List<Instructor> instructors = instructorService.findAll();
		model.addAttribute("instructors", instructors);
		return "instructor-list.html";
	}
	
//	@GetMapping("/instructors")
//	public List<Instructor> getInstructors() {
//		return instructorService.findAll();
//	}
}
