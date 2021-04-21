package project_01;

public class CalcSumOfSet {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}

		System.out.println(sum);
	}
}
