package week_06;

public class Soup {

	// MEM VARS
	private String flavor;
	private int calories;
	
	//CONSTRUCTOR
	public Soup(String flavor, int calories) {
		super();
		this.flavor = flavor;
		this.calories = calories;
	}
	
	//OVERRIDES
	@Override
	public String toString() {
		return "Soup [flavor=" + flavor + ", calories=" + calories + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		//IF WANT TO SEE HASH: System.out.println(result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soup other = (Soup) obj;
		if (calories != other.calories)
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		return true;
	}
}
