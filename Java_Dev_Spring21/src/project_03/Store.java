package project_03;
import java.text.DecimalFormat;
import java.util.*;


public class Store {
	
	//VAR
	static List<Item> itemList = new ArrayList<Item>();
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//TOTAL AFTER TAX METHOD
	public static double addTaxes() {
		double totalTax = 0;
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i) instanceof Grocery) {
			totalTax += itemList.get(i).getPrice() * itemList.get(i).addTax();
			} else if (itemList.get(i) instanceof Clothing) {
				totalTax += itemList.get(i).getPrice() * itemList.get(i).addTax();
			} else if (itemList.get(i) instanceof Pharmacy) {
				totalTax += itemList.get(i).getPrice() * itemList.get(i).addTax();
			}
		}
		return totalTax;
	}
	
	//TOTAL BEFORE TAX METHOD
	public static double beforeTax() {
		double totalCost = 0;
		for (int i = 0; i < itemList.size(); i++) {
			totalCost += itemList.get(i).getPrice();
		}
		return totalCost;
	}
	
	public static void main(String[] args) {
		
		//LOCAL VARS
		int itemType = 0;
		Scanner in = new Scanner(System.in);

		//prompt user and collect info
		while (itemType != 4) {
			
			System.out.println("Enter type of item: (1) for Grocery, "
					+ "(2) for Clothing, (3) for Pharmacy, (4) for done");
			itemType = Integer.valueOf(in.nextLine());
			if (itemType == 4) {break;}
						
			//collect id
			System.out.println("Enter id:");
			int inId = Integer.valueOf(in.nextLine());
			
			//collect item name
			System.out.println("Enter name:");
			String inName = in.nextLine();

			//collect item price
			System.out.println("Enter price:");
			double inPrice = Double.valueOf(in.nextLine());

			//COLLECTION LOOP
			if (itemType == 1) {
				Grocery grocery = new Grocery(inId, inName, inPrice);
				itemList.add(grocery);
			} else if (itemType == 2) {
				Clothing clothing = new Clothing(inId, inName, inPrice);
				itemList.add(clothing);
			} else if (itemType == 3){
				Pharmacy pharmacy = new Pharmacy(inId, inName, inPrice);
				itemList.add(pharmacy);
			} else if (itemType == 4) {break;}		
		}
		
		//CLOSE SCANNER
		in.close();
		
		//ALPHABETIZE ITEMS
		Collections.sort(itemList, Item.ItemAlphabet);
		
		//PRINT ALPHABETIZED GROCERIES -> CLOTHES -> PHARMACY
		System.out.println("Items:");
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i) instanceof Grocery) {
				System.out.println(itemList.get(i).getName() + " " + itemList.get(i).getPrice());
			}
		}
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i) instanceof Clothing) {
				System.out.println(itemList.get(i).getName() + " " + itemList.get(i).getPrice());
			}
		}
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i) instanceof Pharmacy) {
				System.out.println(itemList.get(i).getName() + " " + itemList.get(i).getPrice());
			}
		}
		
		//PRINT TOTAL WITH TAX
		System.out.println(" ");
		System.out.println("Total:");
		System.out.println(df2.format(addTaxes()));
	}

}
