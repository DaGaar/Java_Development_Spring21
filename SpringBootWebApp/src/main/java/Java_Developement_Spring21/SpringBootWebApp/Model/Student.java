package Java_Developement_Spring21.SpringBootWebApp.Model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity 
public class Student {

	// MEM VARS
	@Id
	private Long id;
	private String name;
	private String email;
	private LocalDate dob;
	private Integer age;
	
	@OneToMany(mappedBy = "student")
	private List<Course> courses;
	
	@ManyToMany
	private List<Scholarship> scholarships;
	
	// CONSTRUCTORS
	public Student() {
		super();
	}
	
	public Student(Long id, String name, String email, LocalDate dob, Integer age, List<Course> courses,
			List<Scholarship> scholarships) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
		this.courses = courses;
		this.scholarships = scholarships;
	}

	public Student(Long id, String name, String email, LocalDate dob, Integer age, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
		this.courses = courses;
	}



	public Student(String name, String email, LocalDate dob, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}

	public Student(Long id, String name, String email, LocalDate dob, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}
	
	//GETTERS AND SETTERS
//	public List<Course> getCourses() {
//		return courses;
//	}
//
//	public void setCourses(List<Course> courses) {
//		this.courses = courses;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
		System.out.println("setting id" + id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
//	public List<Scholarship> getScholarships() {
//		return scholarships;
//	}
//
//	public void setScholarships(List<Scholarship> scholarships) {
//		this.scholarships = scholarships;
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age
				+  "]";
	}

	//TOSTRING

}