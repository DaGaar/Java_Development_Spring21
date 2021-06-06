package Java_Developement_Spring21.SpringBootWebApp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Java_Developement_Spring21.SpringBootWebApp.Model.Scholarship;

public interface ScholarshipDAO extends JpaRepository<Scholarship, Long> {

}
