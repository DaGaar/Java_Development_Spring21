package project_04;
import java.util.*;

public class Randomizer {
	
	public static void main(String[] args) {
		
		//VAR
		Random rn = new Random();
		List<Integer> r100 = new ArrayList<Integer>();
		
		//POPULATE ARRAY
		for (int i = 0; i < 100; i++) {
			try {
				r100.add(rn.nextInt());
			} catch(ClassCastException e) {
				System.out.println("ClassCastException: " + e.getMessage());
			} catch(UnsupportedOperationException e) {
				System.out.println("UnsupportedOperationException: " + e.getMessage());
			} catch(NullPointerException e) {
				System.out.println("NullPointerException: " + e.getMessage());
			} catch(IllegalArgumentException e) {
				System.out.println("IllegalArgumentException: " + e.getMessage());
			}
		}
		
		//SORT ARRAY IN ASCENDING ORDER
		try {
			Collections.sort(r100);
		} catch(ClassCastException e) {
			System.out.println("ClassCastException: " + e.getMessage());
		} catch(UnsupportedOperationException e) {
			System.out.println("UnsupportedOperationException: " + e.getMessage());
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException: " + e.getMessage());
		}
		
		//PRINT SORTED ARRAY
		for (int i = 0; i < 100; i++) {
			try {
				System.out.println(r100.get(i));
			} catch(IndexOutOfBoundsException e) {
				System.out.println("IndexOutOfBoundsException: " + e.getMessage());
			}
		}
	}	
}
