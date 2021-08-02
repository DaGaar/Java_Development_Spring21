package com.gaar.dmhelper.DmHelper.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Combatant {
	
	@Id
	private Long id;
	private String side;
	private Double initiative;
	
//	@ManyToOne
//	private Encounter encounter;
//	@ManyToOne 
//	private Pc pc;
	
	
	private Long encounterId;
	
//CONSTRUCTORS	
	public Combatant() {
		super();
	}
	
	public Combatant(Long id, String side, Double initiative, Long encounterId) {
		super();
		this.id = id;
		this.side = side;
		this.initiative = initiative;
		this.encounterId = encounterId;
	}

	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public Double getInitiative() {
		return initiative;
	}

	public void setInitiative(Double initiative) {
		this.initiative = initiative;
	}

	public Long getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(Long encounterId) {
		this.encounterId = encounterId;
	}
	

}
