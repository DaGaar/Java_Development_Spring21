package project_02;

import java.util.*;

public class Student {

  //VARS
  private String firstName;
  private String lastName;
  private int grade;
  static List<Student> students = new ArrayList<Student>();

  //CONSTRUCTORS
  public Student() {

  }

  public Student(String firstName) {
    this.firstName = firstName;
  }

  public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Student(String firstName, String lastName, int grade) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.grade = grade;
  }

  //GETTERS AND SETTERS
  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String fName) {
    this.firstName = fName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lName) {
    this.lastName = lName;
  }

  public int getGrade() {
    return this.grade;
  }

  public void setGrade(int sGrade) {
    this.grade = sGrade;
  }
 
  //GETAVERAGE()
  public static double getAverage() {
	  int total = 0;
	  for (int i = 0; i < students.size(); i++) {
		  total += students.get(i).getGrade();
	  }
	  
	  double average = total / students.size();
	  return average;
	  }

  //TOSTRING()
  public String toString() {
    return "Student: " + firstName + " " + lastName + ", " + grade + "%";
  }
  
  
  public static void main(String[] args) {

    System.out.println("We need to know the average grade in your class of 10 students. Please follow the prompts:");
    
    Scanner in = new Scanner(System.in);

    //collect data from user to populate students array
    for (int i = 0; i < 10; i++) {
    	
      System.out.println("First name of student number " + (i+1) + ": ");
      String inFirstName = in.nextLine();

      System.out.println("Last name of student number " + (i+1) + ": ");
      String inLastName = in.nextLine();
      
      System.out.println("Grade of student number " + (i+1) + ": ");
      int inGrade = Integer.valueOf(in.nextLine());
      if (inGrade < 0) {inGrade = 0;}

      Student student = new Student(inFirstName, inLastName, inGrade);
      students.add(student);
      
      System.out.println(student.toString());
    }
    in.close();
    
    //relay average, final response, mild sass (towards imaginary teacher, not Mr. Redfern).
    System.out.println("Ok, that's all of them; stop now please.");
    System.out.println("Hmmm...");
    System.out.println("That gives us a " + getAverage() + " average." );
    System.out.println("That will suffice. Please get back to lesson planning; we don't want you losing your edge.");

  }
}