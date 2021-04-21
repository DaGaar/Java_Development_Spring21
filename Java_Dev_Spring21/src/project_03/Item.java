package project_03;

import java.util.Comparator;



public abstract class Item{
	//LOC VAR
	int id;
	String name;
	double price;
	
	//TOSTRING
	public String toString() {
		return "[id=" + id + ", name=" + name + ", price=" + price + "]";
	}
				
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//CONSTRUCTOR
	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	//ABSTRACT METHOD
	public abstract double addTax();
	
	//SORTING METHOD
	public static Comparator<Item> ItemAlphabet = new Comparator<Item>() {
		
		public int compare(Item i1, Item i2) {
			String itemName1 = i1.getName().toUpperCase();
			String itemName2 = i2.getName().toUpperCase();			
			return itemName1.compareTo(itemName2);
		}
	};
	
}
