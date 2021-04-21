package project_03;

public class Clothing extends Item implements TenPercentTaxBracket{
	
	Clothing(int id, String name, double price) {
		super(id, name, price);
	}
	
	public double addTax() {	
		return TAX;
	}
}
