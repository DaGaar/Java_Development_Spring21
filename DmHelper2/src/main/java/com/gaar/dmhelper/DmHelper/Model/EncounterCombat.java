package com.gaar.dmhelper.DmHelper.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EncounterCombat {

	@Id
	private Long id;
	private String name;
	private Integer dificulty;
	
	@ManyToOne()
	private Npc npc;
	
	@ManyToOne()
	private Pc pc;
		
	//CONSTRUCTORS
	public EncounterCombat() {
		super();
	}
	
	public EncounterCombat(Long id, String name, Integer dificulty, Npc npc, Pc pc) {
		super();
		this.id = id;
		this.name = name;
		this.dificulty = dificulty;
		this.npc = npc;
		this.pc = pc;
	}
	
	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDificulty() {
		return dificulty;
	}

	public void setDificulty(Integer dificulty) {
		this.dificulty = dificulty;
	}

	public Npc getNpc() {
		return npc;
	}

	public void setNpc(Npc npc) {
		this.npc = npc;
	}

	public Pc getPc() {
		return pc;
	}

	public void setPc(Pc pc) {
		this.pc = pc;
	}

	
	@Override
	public String toString() {
		return "EncounterCombat [id=" + id + ", name=" + name + ", dificulty=" + dificulty + ", npc=" + npc + ", pc="
				+ pc + "]";
	}

}
