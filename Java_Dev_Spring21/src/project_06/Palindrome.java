package project_06;

public final class Palindrome {

	//CONSTRUCTOR
	private Palindrome() {
	}

	//PALINDROME CHECK METHOD
	public static boolean isPalindrome(String oString) {
		
		if (oString.trim().length() == 0) {
			return false;
		}
		
		String rString = Character.toString(oString.charAt(oString.length() - 1));
		
		for (int i = oString.length() - 1; i > 0; i--) {
			rString = rString.concat(Character.toString(oString.charAt(i - 1)));
		}
		
		oString = oString.replaceAll("\\s", "");
		rString = rString.replaceAll("\\s", "");
		
		return oString.equalsIgnoreCase(rString);
		 
	}	
}
