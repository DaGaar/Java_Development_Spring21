package week_05;

import java.util.*;

public class MapDriver {

	public static void main(String[] args) {

		// CREATE MAP
		Map<Integer, String> parts = new TreeMap<Integer, String>();

		//LOAD MAP
		parts.put(999,  "Motor Oil");
		parts.put(109, "Brake Pads");
		parts.put(808, "Gas Cap");
		parts.put(553, "Windshield Wipers");
		
		//PERFORM LOOKUP
		String part = parts.get(999);
		System.out.println(part);
		
		// CHANGE A VALUE
	//	parts.put(999, "better Motor Oil");
		
		// ITERATE OVER OUR MAP
		//        DataType         element   map of entries
		//for(Map.Entry<Integer, String> p : parts.entrySet()) {
		//	System.out.println(p.getKey() + " : " + p.getValue());
		
		//}
		printMap(parts);
	}
	
	public static void printMap(Map<Integer, String> map) {
//HOW DOES THIS KIND OF FOR LOOP WORK???
//ALSO, WHAT WAS THE PURPOSE OF ALL THESE TECHNIQUES? JUST EXAMINE AND SAY IN YOUR OWN WORDS
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " : " + entry.getValue());
		}
	}

}
