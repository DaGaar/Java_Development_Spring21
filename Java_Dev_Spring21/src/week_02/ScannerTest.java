package week_02;

import java.util.*;

import project_02.Student;

public class ScannerTest {
	
	
	public static void main(String[] args) {
		
		//VARS
		String firstName;
		String lastName;
		int grade = 0;
		Scanner in = new Scanner(System.in);
		
		//STUDENT ENROLLMENT TOOL
		List<Student> students = new ArrayList<Student>();
		
		System.out.println("WELCOME TO BRANSON HIGH");
		
		for (int i = 0; i < 2; i++) {
			
			System.out.println("ENTER STUDENT #" + (i +1) + " FIRST NAME");
			firstName = in.nextLine();
			
			System.out.println("ENTER STUDENT #" + (i +1) + " LAST NAME");
			lastName = in.nextLine();
			
			System.out.println("ENTER STUDENT #" + (i +1) + " GRADE");
			grade = Integer.valueOf(in.nextLine());
			
			Student student = new Student(firstName, lastName, grade);
			students.add(student);
			
		}
		
		System.out.println("Class is full. stop.");
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
		in.close();
	}

}
