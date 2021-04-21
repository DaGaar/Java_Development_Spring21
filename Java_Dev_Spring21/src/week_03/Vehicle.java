package week_03;

// CONGRACT: ENSURES THAT THE CLASS IMPLEMENTS ITS METHODS
public interface Vehicle {
	
	// ABSTRACT METHODS
	void accelerate(int mph);
	void decelerate();
	boolean carryPassengers();
	
	
	// CONCRETE METHOD INCLUDES A METHOD BODY
	// EXAMPLE: void jump() {
	// system.out.println("jump");
	// }
}

class Boat implements Vehicle {

	@Override
	public void accelerate(int mph) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean carryPassengers() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

class Car implements Vehicle {
	
	//MEM VARS
	private int mph;
	
	// CONCRETE
	public void accelerate(int mph) {
		this.mph = mph;
		System.out.println("Travelling at " + mph);
	}
	
	public void decelerate() {
		System.out.println("Slowwing down...");
	}
	
	public boolean carryPassengers() {
		return true;
	}
}

class Plane implements Vehicle {
	
	//MEM VARS
	private int mph;
	
	// CONCRETE
	public void accelerate(int mph) {
		this.mph = mph;
		System.out.println("Zooming at " + mph);
	}
	
	public void decelerate() {
		System.out.println("Land soon...");
	}
	
	public boolean carryPassengers() {
		return true;
	}
}