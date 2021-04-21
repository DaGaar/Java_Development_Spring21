package project_06;

import java.util.Scanner;

public class PalindromeDriver {

	public static void main(String[] args) {

		//VARS
		Scanner sc = new Scanner(System.in);
		String pal = null;

		//COLLECT STRING
		System.out.println("Give us a string, any old string.");
		pal = sc.nextLine();

		//CHECK IF PALINDROME
		if (Palindrome.isPalindrome(pal)) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("*sad trombone noises*");
			System.out.println("that is NOT a palindrome.");
		}
		sc.close();
	}
}

