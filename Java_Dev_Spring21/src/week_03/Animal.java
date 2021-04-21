package week_03;

public class Animal {

	private double weight;
	private double hasLegs;
	private String food;
	private boolean isAquatic;
	

	// TOSTRING() METHOD
	public String toString() {
		return "Animal: " + "Food: " + food + " Is Aquatic: " + isAquatic;
	}
	
	//GETTERS AND SETTERS
	
	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHasLegs() {
		return hasLegs;
	}

	public void setHasLegs(double hasLegs) {
		this.hasLegs = hasLegs;
	}
	
	public boolean isAquatic() {
		return isAquatic;
	}
	
	public void setAquatic(boolean isAquatic) {
		this.isAquatic = isAquatic;
	}
	
	//CONSTRUCTORS
	
	public Animal(double weight, double hasLegs, String food, boolean isAquatic) {
		super();
		this.weight = weight;
		this.hasLegs = hasLegs;
		this.food = food;
		this.isAquatic = isAquatic;
	}
	public Animal() {
		
	}
	
	//MAIN
	
	public static void main(String[] args) {
		
		//Spider spud = new Spider(); 
				
	}

}

 class Spider extends Animal {
	
	//SPIDER CONSTRUCTOR 
	 
	Spider() {
			super();
			System.out.println("Created a Spider Object...");
	}
	
	// MEM VARS
	private boolean isRadioactive;
	
	
	public boolean isRadioactive() {
		return isRadioactive;
	}
	
	public void setRadioactive(boolean isRadioactive) {
		this.isRadioactive = isRadioactive;
	}
}

