package week_05;

import java.util.*;

public class PairsDriver {
	
	public static void main(String[] args) {
		
		//LOCAL VARS
		Set<Pairs> comPair = new HashSet<Pairs>();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		//NUMBER OF PAIRS
		System.out.println("How many pairs will you be entering?");
		int nPairs = Integer.parseInt(sc.nextLine());
		
		//COLLECT PAIRS
		System.out.println("Enter " + nPairs + " pairs of Strings.");
		for (int i = 0; i < nPairs; i++) {
			
			//COLLECT A PAIR
			String[] strs = sc.nextLine().split(" ");
			Pairs p = new Pairs(strs[0], strs[1]);
			
			//CHECK IF UNIQUE/INCREASE COUNT
			boolean bool = comPair.contains(p);
			
			if (!bool) {
				count++;
			}
			
			System.out.println("The # of unique pairs is " + count + ".");
			
			//ADD PAIR TO HASHSET
			comPair.add(p);
			
			}
		sc.close();
		System.out.println(comPair.size());
		}	
}
