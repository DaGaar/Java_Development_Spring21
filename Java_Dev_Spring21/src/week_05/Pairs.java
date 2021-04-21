package week_05;

public class Pairs implements Comparable<Pairs>{
	
	//VARS
	private String s1;
	private String s2;
	
	//GETTERS and SETTERS
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "Pairs [s1=" + s1 + ", s2=" + s2 + "]";
	}
	
	//CONSTRUCTOR
	public Pairs(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}

	//OVERRIDES
	@Override
	public int compareTo(Pairs pairs) {
	//	System.out.println("called compareTo");
		int comp = this.s1.compareTo(pairs.s1);
		if(comp == 0)
			comp = this.s2.compareTo(pairs.s2);
		return comp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s1 == null) ? 0 : s1.hashCode());
		result = prime * result + ((s2 == null) ? 0 : s2.hashCode());
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
		Pairs other = (Pairs) obj;
		if (s1 == null) {
			if (other.s1 != null)
				return false;
		} else if (!s1.equals(other.s1))
			return false;
		if (s2 == null) {
			if (other.s2 != null)
				return false;
		} else if (!s2.equals(other.s2))
			return false;
		return true;
	}

}
