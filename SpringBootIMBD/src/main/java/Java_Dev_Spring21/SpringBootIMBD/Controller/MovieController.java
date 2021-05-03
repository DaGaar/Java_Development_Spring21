package Java_Dev_Spring21.SpringBootIMBD.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Java_Dev_Spring21.SpringBootIMBD.Model.Director;
import Java_Dev_Spring21.SpringBootIMBD.Model.Movie;

@RestController
@RequestMapping("api/v1/movie")
public class MovieController {

	@GetMapping
	public List<Movie> allMovies() {
		
		List<Movie> movies = new ArrayList<Movie>();
	
		movies.add(new Movie(2345431L, "Incredibles", "Family/Comedy", 
				LocalDate.of(2004, 10, 27), new Director("Brad", "Bird", 63)));
		movies.add(new Movie(2345432L, "The Secret of Kells", "Fantasy", 
				LocalDate.of(2009, 02, 8), new Director("Tomm", "Moore", 44)));
		movies.add(new Movie(2345433L, "ink", "Science Fantasy", 
				LocalDate.of(2009, 01, 23), new Director("Jamin", "Winans", 53)));
		movies.add(new Movie(2345434L, "Princess Mononoke", "Epic Fantasy", 
				LocalDate.of(1997, 07, 12), new Director("Hayao", "Miyazaki", 80)));
		movies.add(new Movie(2345435L, "Pulp Fiction", "Neo-Noir", 
				LocalDate.of(1994, 05, 21), new Director("Quentin", "Tarantino", 58)));
	
		return movies;
	}
}
