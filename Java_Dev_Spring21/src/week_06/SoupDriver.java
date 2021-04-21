package week_06;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SoupDriver {

	public static void main(String[] args) {

		Set<Soup> soups = new HashSet<Soup>();
		
		soups.add(new Soup("Cream of Broccoli", 250));
		soups.add(new Soup("Chicken Noodle", 175));
		soups.add(new Soup("Mushroom", 225));

		System.out.println(soups);
		
		Soup newSoup = new Soup("Cream of Broccoli", 250);
		
		if(soups.contains(newSoup)) {
			System.out.println("Menu contains: " + newSoup);
		} else {
			System.out.println("Soup not found!");
		}
	}

}
