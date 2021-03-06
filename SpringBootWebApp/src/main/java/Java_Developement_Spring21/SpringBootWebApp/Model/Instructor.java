package Java_Developement_Spring21.SpringBootWebApp.Model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Instructor {

	@Id
	private Long id;
	private String name;
	private LocalDate dob;
	
//	@OneToMany(mappedBy = "instructor")
//	private List<Course> courses;
	
	//CONSTRUCTORS
	public Instructor() {
		super();
	}

//	public Instructor(Long id, String name, LocalDate dob, List<Course> courses) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.dob = dob;
//		this.courses = courses;
//	}

	public Instructor(Long id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	//GETTERS/SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

//	public List<Course> getCourses() {
//		return courses;
//	}
//
//	public void setCourses(List<Course> courses) {
//		this.courses = courses;
//	}
	
	

}
