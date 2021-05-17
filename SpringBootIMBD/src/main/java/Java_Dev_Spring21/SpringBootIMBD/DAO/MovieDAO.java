package Java_Dev_Spring21.SpringBootIMBD.DAO;

import org.springframework.data.repository.CrudRepository;

import Java_Dev_Spring21.SpringBootIMBD.Model.Movie;

public interface MovieDAO extends CrudRepository<Movie, Long> {

}
