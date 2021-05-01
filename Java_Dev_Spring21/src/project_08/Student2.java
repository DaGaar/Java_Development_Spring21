package project_08;

public class Student2 {

	// MEM VARS
	private String lastName;
	private int age;
	private int id;
	
	//GETTERS + SETTERS
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", age=" + age + ", id=" + id + "]";
	}
	
	//CONSTRUCTOR
	public Student2(String lastName, int age, int id) {
		super();
		this.lastName = lastName;
		this.age = age;
		this.id = id;
	}
}