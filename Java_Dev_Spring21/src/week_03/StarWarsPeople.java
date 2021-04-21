package week_03;

public class StarWarsPeople {
	
	//MEM VARS
	private String planet;
	private boolean hasForce;
	private boolean canDestroyPlanet;
	
	//TOSTRING
	@Override
	public String toString() {
		return "StarWarsPeople [planet=" + planet + ", hasForce=" + hasForce + 
				", canDestroyPlanet=" + canDestroyPlanet + "]";
	}
	
	//GETTERS AND SETTERS
	public String getPlanet() {
		return planet;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}
	public boolean isHasForce() {
		return hasForce;
	}
	public void setHasForce(boolean hasForce) {
		this.hasForce = hasForce;
	}
	public boolean isCanDestroyPlanet() {
		return canDestroyPlanet;
	}
	public void setCanDestroyPlanet(boolean canDestroyPlanet) {
		this.canDestroyPlanet = canDestroyPlanet;
	}
	
	//CONSTRUCTORS
	public StarWarsPeople(String planet, boolean hasForce, boolean canDestroyPlanet) {
		super();
		this.planet = planet;
		this.hasForce = hasForce;
		this.canDestroyPlanet = canDestroyPlanet;
	}
	
	public StarWarsPeople() {
		super();
	}
	
	//MAIN
	public static void main(String[] args) {
		
	//	StarWarsPeople jabba = new StarWarsPeople ("Tattoine", false, false);
		
		SandPerson babba = new SandPerson();
		System.out.println(babba);
		
		BabySandPerson gritty = new BabySandPerson("Tattooine", true, true);
		System.out.println(gritty);
	}
}

// SUBCLASS
class SandPerson extends StarWarsPeople {
	
	//MEM VARS
//	private String bantha;

	public SandPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SandPerson(String planet, boolean hasForce, boolean canDestroyPlanet) {
		super(planet, hasForce, canDestroyPlanet);
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTOR
	
}
// SUBSUBCLASS

class BabySandPerson extends SandPerson {

	public BabySandPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BabySandPerson(String planet, boolean hasForce, boolean canDestroyPlanet) {
		super(planet, hasForce, canDestroyPlanet);
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTOR
	
}
