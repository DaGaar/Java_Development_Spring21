package week_04;
import java.util.NoSuchElementException;
import java.util.Random;

public class TryCatchExample {
	
	public static void tryCatchMethod() throws NumberFormatException {
		System.out.println("Executedexample method...");
		throw new NumberFormatException("thrown by my method...");
	}
	
	public static void main(String[] args) {
		
		try {
			tryCatchMethod();
		} catch(Exception e) {
			//System.out.println(e.getMessage());
		}

		//TRY / CATCH EXAMPLE NUM 1
		String str = "42";
		int num = 0;
		
		try {
			num = Integer.valueOf(str);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println(num);
		
		// TRY / CATCH EXAMPLE NUM 2
		Random rn = new Random();
		int roll = 99;
		
		try {
			
			roll = rn.nextInt(10) + 1;
			
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptoin: " + e.getMessage());
		}
		
		System.out.println(roll);
		
		//  TRY / CATCH EXAMPLE NUM 3
		System.out.println("Example #3");
		
		/*try {
			
			throw new NoSuchElementException();
			
		} catch(NoSuchElementException e) {
			
			e.printStackTrace();
			
		}*/
		System.out.println("Program Ended");
	}
	
}
