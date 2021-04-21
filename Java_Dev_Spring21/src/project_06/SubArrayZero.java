package project_06;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SubArrayZero {

	public static void main(String[] args) {

		List<Integer> inArray = new ArrayList<Integer>();
		List<Integer> subArray = new ArrayList<Integer>();
		Map<Integer, List<Integer>> hM = new HashMap<Integer, List<Integer>>();
		int marker, sum;
		
		Scanner sc = new Scanner(System.in);
		
		//GATHER NUMBERS FROM USER
		System.out.println("Give some positive and negative numbers");
		String[] s = sc.nextLine().split(" ");		
		for (int i = 0; i < s.length; i++) {
			try {
			inArray.add(Integer.valueOf(s[i]));	
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("Be sure you are only entering integers");
			}
		}
		
		// 1st LOOP: ITERATE OVER inArray
		for (int i = 0; i < inArray.size(); i++) {			
			marker = i + 1;
			
			//2nd LOOP: MOVE MARKER TO THE RIGHT
			while (marker <= inArray.size()) {
				sum = 0;
				subArray = new ArrayList<>();
				
				// 3RD LOOP: FOR EACH STARTING ELEMENT, LOOP TIL END OF LIST
				for (int j = i; j < marker; j++) {
					subArray.add(inArray.get(j));
					sum += inArray.get(j);
				}
				//System.out.println(subArray.toString()); 
				
				//CHECK IF subArray ELEMENTS ADD TO 0
				if (subArray.size() > 1 && sum == 0) {
					//POPULATE hM WITH LONGEST subArray
					if (hM.isEmpty()) {
						hM.put(sum, subArray);
					} else if (subArray.size() > hM.get(0).size()) {
						hM.put(sum,  subArray);
					}
				}
				marker++;
			}
		}
		
		//SHOW USER NUMBER OF SUBARRAYS
		if (hM.isEmpty()) {
			System.out.println("0");
		} else {
		System.out.println("Largest Sub-Array whose elements sum up to 0: " + hM.get(0));
		}
	sc.close();	
	}
}

