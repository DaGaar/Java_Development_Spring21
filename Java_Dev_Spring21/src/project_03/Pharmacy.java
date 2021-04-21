package project_03;

public class Pharmacy extends Item implements SevenPercentTaxBracket{
	
	Pharmacy(int id, String name, double price) {
		super(id, name, price);
	}
	
	public double addTax() {	
		return TAX;
	}
}
