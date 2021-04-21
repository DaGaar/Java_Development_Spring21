package project_07;

public class CalcSumOfSet {
	
	// METHOD
	public int sumOfSet(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}
}
