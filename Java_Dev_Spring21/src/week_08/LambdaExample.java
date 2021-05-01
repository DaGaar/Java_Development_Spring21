package week_08;

public class LambdaExample {

	public static void main(String[] args) {
		
		//CREATE INTERFACE OBJ REF AND DEFINE SHIP METHOD BODY USING LAMBDA
		Printable p = () -> {
								System.out.println("Ship me by air...");
							};
		p.print();
		
		Printable2 p2 = (str) -> { System.out.println("hello, " + str); };
		p2.print("Cap'n Crunch");
			
		// THE LONG WAY
		Addable aSC = new AddableSubClass();
		int sum = aSC.add(2,  2);
		System.out.println(sum);
		
		// THE LAMBDA WAY

		Addable a = (int n1, int n2) -> { return n1 + n2; };
		System.out.println(a.add(2,  3));
	}

}

// CREATE A FUNCTIONAL INTERFACE - ONLY 1 ABSTRACT METHOD!
interface Printable {
	abstract void print();
}


interface Printable2 {
	abstract void print(String s);
}

interface Addable {
	abstract int add(int num1, int num2);
}

//ALL THIS BELOW IS USUALLY REQUIRED, BUT LAMBDA LETS YOU DO THE ABOVE
class AddableSubClass implements Addable {
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}

class ShipByAir implements Printable {
	
	@Override
	public void print() {
		System.out.println("Ship me by air...");
	}
} 