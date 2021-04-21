package project_01;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		int[] studentA = {8, 2, 3, 1};
		int[] studentB = {3, 4, 5, 6};
		int studentATally = 0;
		int studentBTally = 0;
		
		for (int i = 0; i < studentA.length; i++) {
			if (studentA[i] > studentB[i]) { studentATally++;}
			else if (studentA[i] < studentB[i]) { studentBTally++;}
		}
		
		int[] result = new int[] {studentATally, studentBTally};
		System.out.println(Arrays.toString(result));

	}

}
