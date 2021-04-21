package week_05;
import java.util.*;


//ALL OF THIS TO SHOW: compareTo() looks at the value (case sensitive) of each element in 2 (only 2?) Strings and
//Returns the difference in those values.

public class CompareToDriver2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1, str2;
		int result;
		
		boolean running = true;
		while(running) {
			
			System.out.println("Enter 1st String: ");
			str1 = sc.nextLine();
			
			System.out.println("Enter 2nd String: ");
			str2 = sc.nextLine();
			
			if (str1.equals("exit") || str2.equals("exit")) {
				running = false;
			} else {
				result = str1.compareTo(str2);
				
				System.out.println("\"" + str1 + "\".compareTo(\"" + str2 + "\") = " + result + "\n");					
			}
				
			
		}
		
		System.out.println("Goodbye..");
		
	}

}
