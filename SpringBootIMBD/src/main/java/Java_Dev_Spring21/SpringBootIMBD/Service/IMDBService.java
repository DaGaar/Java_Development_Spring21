package Java_Dev_Spring21.SpringBootIMBD.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//import Java_Dev_Spring21.SpringBootIMBD.Model.Director;
import Java_Dev_Spring21.SpringBootIMBD.Model.Movie;

@Service
public class IMDBService {
	
	//BUSINESS LOGIC LAYOR
	public List<Movie> getMovies() {
		
		return Arrays.asList(
//				new Movie(2345431L, "Incredibles", "Family/Comedy", 
//						LocalDate.of(2004, 10, 27), new Director("Brad", "Bird", 63)),
//				new Movie(2345432L, "The Secret of Kells", "Fantasy", 
//						LocalDate.of(2009, 02, 8), new Director("Tomm", "Moore", 44)),
//				new Movie(2345433L, "ink", "Science Fantasy", 
//						LocalDate.of(2009, 01, 23), new Director("Jamin", "Winans", 53)),
//				new Movie(2345434L, "Princess Mononoke", "Epic Fantasy", 
//						LocalDate.of(1997, 07, 12), new Director("Hayao", "Miyazaki", 80)),
//				new Movie(2345435L, "Pulp Fiction", "Neo-Noir", 
//						LocalDate.of(1994, 05, 21), new Director("Quentin", "Tarantino", 58))
				new Movie(2345431L, "Incredibles", "Family/Comedy", 
						LocalDate.of(2004, 10, 27), "Brad Bird"),
				new Movie(2345432L, "The Secret of Kells", "Fantasy", 
						LocalDate.of(2009, 02, 8), "Tomm Moore"),
				new Movie(2345433L, "ink", "Science Fantasy", 
						LocalDate.of(2009, 01, 23), "Jamin Winans"),
				new Movie(2345434L, "Princess Mononoke", "Epic Fantasy", 
						LocalDate.of(1997, 07, 12), "Hayao Miyazaki"),
				new Movie(2345435L, "Pulp Fiction", "Neo-Noir", 
						LocalDate.of(1994, 05, 21), "Quentin Tarantino")
		);
		
	}
		
//		List<Movie> movies = new ArrayList<Movie>();
//	
//		
//		movies.add(new Movie(2345431L, "Incredibles", "Family/Comedy", 
//				LocalDate.of(2004, 10, 27), new Director("Brad", "Bird", 63)));
//		movies.add(new Movie(2345432L, "The Secret of Kells", "Fantasy", 
//				LocalDate.of(2009, 02, 8), new Director("Tomm", "Moore", 44)));
//		movies.add(new Movie(2345433L, "ink", "Science Fantasy", 
//				LocalDate.of(2009, 01, 23), new Director("Jamin", "Winans", 53)));
//		movies.add(new Movie(2345434L, "Princess Mononoke", "Epic Fantasy", 
//				LocalDate.of(1997, 07, 12), new Director("Hayao", "Miyazaki", 80)));
//		movies.add(new Movie(2345435L, "Pulp Fiction", "Neo-Noir", 
//				LocalDate.of(1994, 05, 21), new Director("Quentin", "Tarantino", 58)));
//	
//		return movies;
//	}

}
