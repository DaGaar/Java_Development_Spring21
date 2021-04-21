package week_05;

public class Person implements Comparable<Person> {
	
	// MEM VARS
	private String lName;
	private String fName;
	
	public Person() {
		super();
	}
	
	//CONSTRUCTOR
	public Person(String lName, String fName) {
		super();
		this.lName = lName;
		this.fName = fName;
	}
	
	//TOSTRING
	public String toString() {
		return "Person [lName=" + lName + ", fName=" + fName + "]";
	}
	
	//GETTERS AND SETTERS
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
//STUDY THE COMPARETO METHOD	
	@Override
	public int compareTo(Person person) {
	//	System.out.println("called compareTo");
		int comp = this.lName.compareTo(person.lName);
		if(comp == 0)
			comp = this.fName.compareTo(person.fName);
		return comp;
	}
	

}
