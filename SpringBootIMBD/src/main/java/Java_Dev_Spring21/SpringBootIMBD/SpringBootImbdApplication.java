package Java_Dev_Spring21.SpringBootIMBD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class SpringBootImbdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootImbdApplication.class, args);
	}

	@GetMapping
	public String index() {
		return"index.html";
	}
}
