package project_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class LamCompDrive2 {

	public static void main(String[] args) {

		List<Student2> students = new ArrayList<Student2>();
		students.add(new Student2("Wells", 34, 32765));
		students.add(new Student2("Gaar", 30, 32767));
		students.add(new Student2("Moore", 39, 32465));
		students.add(new Student2("Cambel", 24, 38734));
		students.add(new Student2("Ferns", 26, 14665));
		students.add(new Student2("Obama", 29, 32835));
		students.add(new Student2("Tims", 33, 32127));
		students.add(new Student2("Forkwell", 34, 16531));
		students.add(new Student2("Hindsworth", 20, 32234));
		students.add(new Student2("Lycanthrop", 23, 36527));

		students.sort((Student2 o1, Student2 o2) -> 
			{
				if (o1.getAge() - o2.getAge() == 0) {
					return o1.getLastName().compareTo(o2.getLastName());
				} else {
					return o1.getAge() - o2.getAge();
				}
			});
		
		students.forEach((s) -> System.out.println(s.toString()));
	}

}