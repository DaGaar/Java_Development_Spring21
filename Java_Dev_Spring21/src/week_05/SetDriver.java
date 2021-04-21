package week_05;

import java.util.*;

public class SetDriver {
	
	public static Set<Integer> setA = new HashSet<Integer>();
	public static Set<Integer> setB = new TreeSet<Integer>();

	public static void main(String[] args) {

		//add element to set a
		setA.add(77);
		setA.add(75);
		setA.add(83);
		setA.add(99);
		
		System.out.println(setA);

		setB.add(99);
		setB.add(32);
		setB.addAll(Arrays.asList(2, 22, 53, 65, 83, 32));
		
		System.out.println(setB);
		
		boolean contains77 = setA.contains(77);
		System.out.println("does my setA contain 77? " + contains77);
		
		//INTERSECTION
		Set<Integer> intersection = new HashSet<Integer>(setA);
		intersection.retainAll(setB);
		System.out.println("Intersection of setA and setB: ");
		System.out.println(intersection + "\n");
		
		//DIFFERENCE
		Set<Integer> difference = new HashSet<Integer>(setA);
		difference.removeAll(setB);
		System.out.println("Difference of setA and setB: ");
		System.out.println(difference);
	}

}
