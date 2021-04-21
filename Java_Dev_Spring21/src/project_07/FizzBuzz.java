package project_07;

public class FizzBuzz {
	
	public String fizzBuzzSingle(int fbs) {
		//METHOD VARS
		String nonsense = null;
		
		if (fbs % 3 == 0 && fbs % 5 == 0) {nonsense = "fizzbuzz";}
		else if (fbs % 3 == 0) {nonsense = "fizz";}
		else if (fbs % 5 == 0) {nonsense = "buzz";}
		else {nonsense = "buzzfizz";}
		
		return nonsense;
	}
	
	public String[] fizzBuzzLoop(int fbl) {
		String[] nonsense = new String[fbl];
		
		for (int i = 1; i <= fbl; i++) {
			if (i % 3 == 0 && i % 5 == 0) {nonsense[(i - 1)] = "fizzbuzz";}
			else if (i % 3 == 0) {nonsense[(i - 1)] = "fizz";}
			else if (i % 5 == 0) {nonsense[(i - 1)] = "buzz";}
			else {nonsense[(i - 1)] = "buzzfizz";}
		} 
		 
		return nonsense;
	}
}
