package Java_Dev_Spring21.SpringBootIMBD.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Java_Dev_Spring21.SpringBootIMBD.DAO.MovieDAO;
//import Java_Dev_Spring21.SpringBootIMBD.Model.Director;
import Java_Dev_Spring21.SpringBootIMBD.Model.Movie;
import Java_Dev_Spring21.SpringBootIMBD.Service.IMDBService;

@Controller
public class MovieController {

	//MEM VARS
	//private final IMDBService imdbService;
	
	@Autowired
	MovieDAO movieDAO;
//	public MovieController(IMDBService imdbService) {
//		super();
//		this.imdbService = imdbService;
//	}
	@RequestMapping("api/v1/movie")
	public String movieJSP() {
		return "movie.html";
	}
	
	@RequestMapping("api/v1/addMovie")
	public String addMovie(Movie movie) {
		movieDAO.save(movie);
		return "movie.html";
	}
//	@GetMapping
//	public List<Movie> getMovies() {
//		return imdbService.getMovies();		
//	}
}
