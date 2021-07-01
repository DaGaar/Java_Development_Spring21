package com.gaar.dmhelper.DmHelper.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pc {

	@Id
	private Long id;
	private String name;
	private Integer level;
	private Integer perceptionMod;
	private Integer insightMod;
	private Integer ac;
	private Integer hp;
	private Integer initiative;
	
//	@OneToMany(mappedBy = "pc")
//	private List<EncounterCombat> encounterCombat;

	//CONSTRUCTORS
	public Pc() {
		super();
	}
	
	
	
//	public Pc(Long id, String name, Integer level, Integer perceptionMod, Integer insightMod, Integer ac, Integer hp,
//			Integer initiative, List<EncounterCombat> encounterCombat) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.level = level;
//		this.perceptionMod = perceptionMod;
//		this.insightMod = insightMod;
//		this.ac = ac;
//		this.hp = hp;
//		this.initiative = initiative;
//		this.encounterCombat = encounterCombat;
//	}

	public Pc(Long id, String name, Integer level, Integer perceptionMod, Integer insightMod, Integer ac, Integer hp,
			Integer initiative) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.perceptionMod = perceptionMod;
		this.insightMod = insightMod;
		this.ac = ac;
		this.hp = hp;
		this.initiative = initiative;
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

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getPerceptionMod() {
		return perceptionMod;
	}

	public void setPerceptionMod(Integer perceptionMod) {
		this.perceptionMod = perceptionMod;
	}

	public Integer getInsightMod() {
		return insightMod;
	}

	public void setInsightMod(Integer insightMod) {
		this.insightMod = insightMod;
	}

	public Integer getAc() {
		return ac;
	}

	public void setAc(Integer ac) {
		this.ac = ac;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getInitiative() {
		return initiative;
	}

	public void setInitiave(Integer initiative) {
		this.initiative = initiative;
	}

//	public List<EncounterCombat> getEncounterCombat() {
//		return encounterCombat;
//	}
//
//	public void setEncounterCombat(List<EncounterCombat> encounterCombat) {
//		this.encounterCombat = encounterCombat;
//	}

//	@Override
//	public String toString() {
//		return "Pc [id=" + id + ", name=" + name + ", level=" + level + ", perceptionMod=" + perceptionMod
//				+ ", insightMod=" + insightMod + ", ac=" + ac + ", hp=" + hp + ", initiative=" + initiative
//				+ ", encounterCombat=" + encounterCombat + "]";
//	}
	
	
}
