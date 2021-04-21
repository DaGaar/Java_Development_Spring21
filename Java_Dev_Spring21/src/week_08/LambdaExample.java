package week_08;

public class LambdaExample {

	public static void main(String[] args) {
		
		//CREATE INTERFACE OBJ REF AND DEFINE SHIP METHOD BODY USING LAMBDA
		Shippable s = () -> {
								System.out.println("Ship me by air...");
							};
		s.ship();
	}

}

// CREATE A FUNCTIONAL INTERFACE - ONLY 1 ABSTRACT METHOD!
interface Shippable {
	abstract void ship();
}

//ALL THIS BELOW IS USUALLY REQUIRED, BUT LAMBDA LETS YOU DO THE ABOVE
/*class ShipByAir implements Shippable {
	
	@Override
	public void ship() {
		System.out.println("Ship me by air...");
	}
} */