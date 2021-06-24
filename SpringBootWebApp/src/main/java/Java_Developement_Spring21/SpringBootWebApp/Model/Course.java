package Java_Developement_Spring21.SpringBootWebApp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	
	//VARS
	@Id
	private Long id;
	private String name;
	private String department;
	
//	@ManyToOne()
//	private Student student;
//	
//	@ManyToOne()
//	private Instructor instructor;
	

	//CONSTRUCTORS
	public Course() {
		super();
	}



//	public Course(Long id, String name, String department, Student student, Instructor instructor) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.department = department;
//		this.student = student;
//		this.instructor = instructor;
//	}



	public Course(Long id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}



	//GETTERS AND SETTERS
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
//	public Instructor getInstructor() {
//		return instructor;
//	}
//	public void setInstructor(Instructor instructor) {
//		this.instructor = instructor;
//	}



	//OVERIDES
	



	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", department=" + department + ", instructor=" +  "]";
	}
	

}
