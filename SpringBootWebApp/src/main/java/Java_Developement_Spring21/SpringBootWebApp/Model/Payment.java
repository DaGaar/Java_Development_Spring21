package Java_Developement_Spring21.SpringBootWebApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Payment {

	//MEM VARS
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="payment_generator")
	@SequenceGenerator(	name="payment_generator", 
						sequenceName="payment_seq", 
						initialValue=3000, 
						allocationSize=100)
	@Column(name="id", updatable=false, nullable=false)
	private long id;
	private String type;
	private int amount;
	
	//CONSTRUCTORS
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(long id, String type, int amount) {
		super();
		this.id = id;
		this.type = type;
		this.amount = amount;
	}
	
	//GETTERS AND SETTERS
	public long getId() {
		return id;
	}
//	public void setId(long id) {
//		this.id = id;
//	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

	
}
