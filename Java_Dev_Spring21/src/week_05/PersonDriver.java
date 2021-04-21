package week_05;
import java.util.*;

public class PersonDriver {

	public static void main(String[] args) {


		Person p1 = new Person("Wonka", "Willie");
		Person p2 = new Person("Wanda", "Wallie");
		Person p3 = new Person("bopo", "bapo");
		Person p4 = new Person("Mr.", "P");
		
		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(new Person("Dumpty", "humpty"));

		for(Person p: people) {
			System.out.println(p);
		}
		
		Collections.sort(people);
		
		for(Person p: people) {
			System.out.println(p);
		}
		
	}

}
