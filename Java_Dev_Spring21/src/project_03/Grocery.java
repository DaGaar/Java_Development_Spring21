package project_03;

public class Grocery extends Item implements FivePercentTaxBracket {

	Grocery(int id, String name, double price) {
		super(id, name, price);
	}	
	
	public double addTax() {	
		return TAX;
	}
}
