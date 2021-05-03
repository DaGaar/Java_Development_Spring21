package Java_Dev_Spring21.SpringBootIMBD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootImbdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootImbdApplication.class, args);
	}

	@GetMapping
	public String landingPage() {
		return"<h1>IMBD: We know the movies</h1>";
	}
}
