package Java_Dev_Spring21.SpringBootIMBD.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Java_Dev_Spring21.SpringBootIMBD.Model.Director;
import Java_Dev_Spring21.SpringBootIMBD.Model.Movie;
import Java_Dev_Spring21.SpringBootIMBD.Service.IMDBService;

@RestController
@RequestMapping("api/v1/movie")
public class MovieController {

	//MEM VARS
	private final IMDBService imdbService;
	
	@Autowired
	public MovieController(IMDBService imdbService) {
		super();
		this.imdbService = imdbService;
	}
	
	@GetMapping
	public List<Movie> getMovies() {
		return imdbService.getMovies();		
	}
}
