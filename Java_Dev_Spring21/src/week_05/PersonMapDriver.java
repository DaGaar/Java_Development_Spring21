package week_05;
import java.util.*;

public class PersonMapDriver {

	public static void main(String[] args) {
		
		Person p1 = new Person("Wonka", "Willie");
		Person p2 = new Person("Wanda", "Wallie");
		Person p3 = new Person("bopo", "bapo");
		Person p4 = new Person("Mr.", "P");
		
		Map<Integer, Person> pMap = new HashMap<Integer, Person>();
		pMap.put(11111111, p1);
		pMap.put(11131111, p2);
		pMap.put(11141111, p3);
		pMap.put(11151111, p4);
		
		Set<Integer> ssns = new TreeSet<Integer>();

	//	System.out.println(pMap);
		
		for(Map.Entry<Integer, Person> entry : pMap.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
			// FOR JUST SSN ssns.add(entry.getKey());
		}
	// FOR JUST SSN 	System.out.println(ssns);
	}

}
