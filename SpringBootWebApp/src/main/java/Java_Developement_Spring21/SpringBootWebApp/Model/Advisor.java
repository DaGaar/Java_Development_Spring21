package Java_Developement_Spring21.SpringBootWebApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Advisor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//be sure to comment out id setter
	private long id;
	private String name;
	private String department;
	
	//CONSTRUCTORS
	public Advisor(long id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public Advisor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//GETTERS AND SETTERS
	public long getId() {
		return id;
	}
//	public void setId(long id) {
//		this.id = id;
//	}
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
	
	

}
