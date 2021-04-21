package project_05;
import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		
		//VARS
		Scanner sc = new Scanner(System.in);
		Map<String, String> pBook = new HashMap<String, String>();
		
		//COLLECT # OF ENTRIES FROM USER
		System.out.println("How many cantacts would you like to enter?");		
		int numOfEntries = Integer.valueOf(sc.nextLine());

		//COLLECT ENTRIES FROM USER
		for (int i = 0; i < numOfEntries; i++) {
			System.out.println("Enter contact " + (i + 1) + "'s name: 'Last Name, First Name'");
			String cName = sc.nextLine();
			System.out.println("Enter contact " + (i + 1) + "'s phone number (ex. 4176734301)");
			String cNumber = sc.nextLine();
			pBook.put(cName, cNumber);
		}

		//ALLOW USER TO LOOK UP NUMBERS OR EXIT PROGRAM
		System.out.println("Look up contact numbers by entering cantacts Last Name, First Name."
				+ " Enter 'exit' to exit.");
		
		//QUERY LOOP
		Boolean running = true;
		while (running) {
			String query = sc.nextLine();
			if (query.equals("exit")) {
				running = false;
			} else if (pBook.containsKey(query)) {
				 System.out.println(query + " | " + pBook.get(query));
			} else {
				 System.out.println(query + " | <No Listing>");
			}
		}
		sc.close();
		System.out.println("Entries and queries complete.");
		
	}
}
