package project_07;

public class CompareArrays {
	
	//METHOD
	public int[] compareArrays(int[] a1, int[] a2) {
		//LOCAL VARS
		int a1Tally = 0;
		int a2Tally = 0;
		
		//LOOP FOR TALLY
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] > a2[i]) { a1Tally++;}
			else if (a1[i] < a2[i]) { a2Tally++;}
		}
		
		//RETURN ARRAY OF RESULT
		int[] result = new int[] {a1Tally, a2Tally};
		return result;
	}
}
