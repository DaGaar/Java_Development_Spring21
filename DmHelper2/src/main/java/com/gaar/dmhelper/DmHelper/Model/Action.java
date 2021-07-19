package com.gaar.dmhelper.DmHelper.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Action {

	//Variables
	@Id
	private Long id;
	
//	@OneToOne
	private Long encounterCombat;
	
//	@ManyToOne
	private Long attackerId;
	
//	@ManyToOne
	private Long attackedId;
	
	private Integer dmgDone;
	
	//CONSTRUCTORS
	public Action() {
		super();
	}

	public Action(Long id, Long encounterCombat, Long attackerId, 
			Long attackedId, int dmgDone) {
		super();
		this.id = id;
		this.encounterCombat = encounterCombat;
		this.attackerId = attackerId;
		this.attackedId = attackedId;
		this.dmgDone = dmgDone;
	}

	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEncounterCombat() {
		return encounterCombat;
	}

	public void setEncounterCombat(Long encounterCombat) {
		this.encounterCombat = encounterCombat;
	}

	public Long getAttackerId() {
		return attackerId;
	}

	public void setAttackerId(Long attackerId) {
		this.attackerId = attackerId;
	}

	public Long getAttackedId() {
		return attackedId;
	}

	public void setAttackedId(Long attackedId) {
		this.attackedId = attackedId;
	}

	public int getDmgDone() {
		return dmgDone;
	}

	public void setDmgDone(int dmgDone) {
		this.dmgDone = dmgDone;
	}
		
}
