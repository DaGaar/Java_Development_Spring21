package week_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

class ListExample {

	public static void main(String[] args) {
		
		
		List<String> groceryList = new ArrayList<String>();
		List<Integer> vector1 = new Vector<Integer>(Arrays.asList(7, 77, 777, 7777));
		
		groceryList.add("butter");
		groceryList.add("milk");
		groceryList.add("bread");
		groceryList.add("avocados");
		
		for (int i = groceryList.size() - 1; i >= 0; i--) {
			try {
				System.out.println(groceryList.get(i));
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}

		
		for(Integer vec : vector1) {
			System.out.println(vec);
			
		}
		
	}
	
}