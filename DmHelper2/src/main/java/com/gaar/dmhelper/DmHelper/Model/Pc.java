package com.gaar.dmhelper.DmHelper.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


//import com.gaar.dmhelper.DmHelper.Model.EncounterCombat;

@Entity
public class Pc {

	@Id
	private Long id;
	
	//game stats
	private String name;
	private String race;
	private String background;
	private Integer level;
	private Integer xp;
	private Integer perceptionMod;
	private Integer insightMod;
	private Integer ac;
	private Integer maxHp;
	private Integer currentHp;
	private Integer initiative;
	private Integer profBonus;
	private Integer atkMod;
	private Integer moveSpeed;
	private Integer swimSpeed;
	private Integer climbSpeed;
	private Integer flySpeed;
	
	
	//attributes
//	private Integer str;
//	private Integer strMod;
//	private Integer dex;
//	private Integer dexMod;
//	private Integer con;
//	private Integer conMod;
//	private Integer wis;
//	private Integer wisMod;
//	private Integer intel;
//	private Integer intMod;
//	private Integer cha;
//	private Integer chaMod;
//	
//	//saving throws
//	private Integer strSave;
//	private Integer dexSave;
//	private Integer conSave;
//	private Integer wisSave;
//	private Integer intSave;
//	private Integer chaSave;
	
	//senses
	private Integer passivePerc;
	private Integer passiveInsight;
	private Integer passiveInvest;
	
	//skills
//	private Integer acrobatics;
//	private Integer animalHandling;
//	private Integer arcana;
//	private Integer athletics;
//	private Integer deception;
//	private Integer history;
//	private Integer insight;
//	private Integer intimidation;
//	private Integer investigation;
//	private Integer medicine;
//	private Integer nature;
//	private Integer perception;
//	private Integer performance;
//	private Integer persuasion;
//	private Integer religion;
//	private Integer slightOfHand;
//	private Integer stealth;
//	private Integer survival;
	
	//brag stats
//	private Integer totalAtks;
//	private Integer totalAtksTaken;
//	private Integer totalTimesAtked;
//	private Integer totalHitsTaken;
//	private Integer totalHitsDodged;
//	private Integer totalCrits;
//	private Integer totalCritFails;
//	private Integer totalMassiveDmgs;
//	private Integer timesGoneDown;
//	private Integer totalHits;
//	private Integer totalMisses;
//	private Integer totalDmgDone;
//	private Integer totalDmgTaken;
//	private Integer totalCombats;
//	private Integer totalKills;
		
//	@OneToMany(mappedBy = "pc")
//	@OneToMany(mappedBy = "pc")
//	private List<EncounterCombat> encounterCombat;
	
	@ManyToMany(mappedBy = "pc")
	private List<EncounterCombat> encounterCombat;
	
	
//	@OneToMany
//	private List<Action> actions;

	//CONSTRUCTORS
	public Pc() {
		super();
	}
	
	
		
//	public Pc(Long id, String name, String race, String background, Integer level, Integer xp, Integer perceptionMod,
//			Integer insightMod, Integer ac, Integer maxHp, Integer currentHp, Integer initiative, Integer profBonus,
//			Integer atkMod, Integer moveSpeed, Integer swimSpeed, Integer climbSpeed, Integer flySpeed,
//			Integer passivePerc, Integer passiveInsight, Integer passiveInvest, Integer totalAtks,
//			Integer totalAtksTaken, Integer totalTimesAtked, Integer totalHitsTaken, Integer totalHitsDodged,
//			Integer totalCrits, Integer totalCritFails, Integer totalMassiveDmgs, Integer timesGoneDown,
//			Integer totalHits, Integer totalMisses, Integer totalDmgDone, Integer totalDmgTaken, Integer totalCombats,
//			Integer totalKills, List<EncounterCombat> encounterCombat, List<Action> actions) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.race = race;
//		this.background = background;
//		this.level = level;
//		this.xp = xp;
//		this.perceptionMod = perceptionMod;
//		this.insightMod = insightMod;
//		this.ac = ac;
//		this.maxHp = maxHp;
//		this.currentHp = currentHp;
//		this.initiative = initiative;
//		this.profBonus = profBonus;
//		this.atkMod = atkMod;
//		this.moveSpeed = moveSpeed;
//		this.swimSpeed = swimSpeed;
//		this.climbSpeed = climbSpeed;
//		this.flySpeed = flySpeed;
//		this.passivePerc = passivePerc;
//		this.passiveInsight = passiveInsight;
//		this.passiveInvest = passiveInvest;
//		this.totalAtks = totalAtks;
//		this.totalAtksTaken = totalAtksTaken;
//		this.totalTimesAtked = totalTimesAtked;
//		this.totalHitsTaken = totalHitsTaken;
//		this.totalHitsDodged = totalHitsDodged;
//		this.totalCrits = totalCrits;
//		this.totalCritFails = totalCritFails;
//		this.totalMassiveDmgs = totalMassiveDmgs;
//		this.timesGoneDown = timesGoneDown;
//		this.totalHits = totalHits;
//		this.totalMisses = totalMisses;
//		this.totalDmgDone = totalDmgDone;
//		this.totalDmgTaken = totalDmgTaken;
//		this.totalCombats = totalCombats;
//		this.totalKills = totalKills;
//		this.encounterCombat = encounterCombat;
//		this.actions = actions;
//	}



//	public Pc(Long id, String name, Integer level, Integer perceptionMod, Integer insightMod, Integer ac, Integer maxHp,
//			Integer initiative, List<EncounterCombat> encounterCombat) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.level = level;
//		this.perceptionMod = perceptionMod;
//		this.insightMod = insightMod;
//		this.ac = ac;
//		this.maxHp = maxHp;
//		this.initiative = initiative;
//		this.encounterCombat = encounterCombat;
//	}

//	public Pc(Long id, String name, String race, String background, Integer level, Integer xp, Integer perceptionMod,
//			Integer insightMod, Integer ac, Integer maxHp, Integer currentHp, Integer initiative, Integer profBonus,
//			Integer atkMod, Integer moveSpeed, Integer swimSpeed, Integer climbSpeed, Integer flySpeed, Integer str, Integer strMod, Integer dex,
//			Integer dexMod, Integer con, Integer conMod, Integer wis, int wisMod, Integer intel, Integer intMod, Integer cha, Integer chaMod,
//			Integer strSave, Integer dexSave, Integer conSave, Integer wisSave, Integer intSave, Integer chaSave, Integer passivePerc,
//			Integer passiveInsight, Integer passiveInvest, Integer acrobatics, Integer animalHandling, Integer arcana, Integer athletics,
//			Integer deception, Integer history, Integer insight, Integer intimidation, Integer investigation, Integer medicine, Integer nature,
//			Integer perception, Integer performance, Integer persuasion, Integer religion, Integer slightOfHand, Integer stealth, Integer survival,
//			Integer totalAtks, Integer totalAtksTaken, Integer totalTimesAtked, Integer totalHitsTaken,
//			Integer totalHitsDodged, Integer totalCrits, Integer totalCritFails, Integer totalMassiveDmgs,
//			Integer timesGoneDown, Integer totalHits, Integer totalMisses, Integer totalDmgDone, Integer totalDmgTaken,
//			Integer totalCombats, Integer totalKills, List<EncounterCombat> encounterCombat) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.race = race;
//		this.background = background;
//		this.level = level;
//		this.xp = xp;
//		this.perceptionMod = perceptionMod;
//		this.insightMod = insightMod;
//		this.ac = ac;
//		this.maxHp = maxHp;
//		this.currentHp = currentHp;
//		this.initiative = initiative;
//		this.profBonus = profBonus;
//		this.atkMod = atkMod;
//		this.moveSpeed = moveSpeed;
//		this.swimSpeed = swimSpeed;
//		this.climbSpeed = climbSpeed;
//		this.flySpeed = flySpeed;
//		this.str = str;
//		this.strMod = strMod;
//		this.dex = dex;
//		this.dexMod = dexMod;
//		this.con = con;
//		this.conMod = conMod;
//		this.wis = wis;
//		this.wisMod = wisMod;
//		this.intel = intel;
//		this.intMod = intMod;
//		this.cha = cha;
//		this.chaMod = chaMod;
//		this.strSave = strSave;
//		this.dexSave = dexSave;
//		this.conSave = conSave;
//		this.wisSave = wisSave;
//		this.intSave = intSave;
//		this.chaSave = chaSave;
//		this.passivePerc = passivePerc;
//		this.passiveInsight = passiveInsight;
//		this.passiveInvest = passiveInvest;
//		this.acrobatics = acrobatics;
//		this.animalHandling = animalHandling;
//		this.arcana = arcana;
//		this.athletics = athletics;
//		this.deception = deception;
//		this.history = history;
//		this.insight = insight;
//		this.intimidation = intimidation;
//		this.investigation = investigation;
//		this.medicine = medicine;
//		this.nature = nature;
//		this.perception = perception;
//		this.performance = performance;
//		this.persuasion = persuasion;
//		this.religion = religion;
//		this.slightOfHand = slightOfHand;
//		this.stealth = stealth;
//		this.survival = survival;
//		this.totalAtks = totalAtks;
//		this.totalAtksTaken = totalAtksTaken;
//		this.totalTimesAtked = totalTimesAtked;
//		this.totalHitsTaken = totalHitsTaken;
//		this.totalHitsDodged = totalHitsDodged;
//		this.totalCrits = totalCrits;
//		this.totalCritFails = totalCritFails;
//		this.totalMassiveDmgs = totalMassiveDmgs;
//		this.timesGoneDown = timesGoneDown;
//		this.totalHits = totalHits;
//		this.totalMisses = totalMisses;
//		this.totalDmgDone = totalDmgDone;
//		this.totalDmgTaken = totalDmgTaken;
//		this.totalCombats = totalCombats;
//		this.totalKills = totalKills;
//		this.encounterCombat = encounterCombat;
//	}

	public Pc(Long id, String name, String race, String background, Integer level, Integer xp, Integer perceptionMod,
			Integer insightMod, Integer ac, Integer maxHp, Integer currentHp, Integer initiative, Integer profBonus,
			Integer atkMod, Integer moveSpeed, Integer swimSpeed, Integer climbSpeed, Integer flySpeed,
			Integer passivePerc, Integer passiveInsight, Integer passiveInvest, List<EncounterCombat> encounterCombat) {
		super();
		this.id = id;
		this.name = name;
		this.race = race;
		this.background = background;
		this.level = level;
		this.xp = xp;
		this.perceptionMod = perceptionMod;
		this.insightMod = insightMod;
		this.ac = ac;
		this.maxHp = maxHp;
		this.currentHp = currentHp;
		this.initiative = initiative;
		this.profBonus = profBonus;
		this.atkMod = atkMod;
		this.moveSpeed = moveSpeed;
		this.swimSpeed = swimSpeed;
		this.climbSpeed = climbSpeed;
		this.flySpeed = flySpeed;
		this.passivePerc = passivePerc;
		this.passiveInsight = passiveInsight;
		this.passiveInvest = passiveInvest;
		this.encounterCombat = encounterCombat;
	}
	public Pc(Long id, String name, Integer level, Integer perceptionMod, Integer insightMod, Integer ac, Integer maxHp,
			Integer initiative) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.perceptionMod = perceptionMod;
		this.insightMod = insightMod;
		this.ac = ac;
		this.maxHp = maxHp;
		this.initiative = initiative;
	}
	
//	public Pc(Long id, String name, Integer level, Integer xp, Integer perceptionMod, Integer insightMod, Integer ac,
//			Integer maxHp, Integer currentHp, Integer initiative, Integer totalCrits, Integer totalCritFails,
//			Integer totalMassiveDmgs, Integer timesGoneDown, Integer totalHits, Integer totalMisses,
//			Integer totalDmgDone, Integer totalDmgTaken, Integer totalCombats, List<EncounterCombat> encounterCombat) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.level = level;
//		this.xp = xp;
//		this.perceptionMod = perceptionMod;
//		this.insightMod = insightMod;
//		this.ac = ac;
//		this.maxHp = maxHp;
//		this.currentHp = currentHp;
//		this.initiative = initiative;
//		this.totalCrits = totalCrits;
//		this.totalCritFails = totalCritFails;
//		this.totalMassiveDmgs = totalMassiveDmgs;
//		this.timesGoneDown = timesGoneDown;
//		this.totalHits = totalHits;
//		this.totalMisses = totalMisses;
//		this.totalDmgDone = totalDmgDone;
//		this.totalDmgTaken = totalDmgTaken;
//		this.totalCombats = totalCombats;
//		this.encounterCombat = encounterCombat;
//	}

	//GETTERS AND SETTERS
	
	
	public Long getId() {
		return id;
	}

//	public List<Action> getActions() {
//		return actions;
//	}
//
//	public void setActions(List<Action> actions) {
//		this.actions = actions;
//	}

	public void setPassiveInvest(Integer passiveInvest) {
		this.passiveInvest = passiveInvest;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public Integer getProfBonus() {
		return profBonus;
	}

	public void setProfBonus(Integer profBonus) {
		this.profBonus = profBonus;
	}

	public Integer getAtkMod() {
		return atkMod;
	}

	public void setAtkMod(Integer atkMod) {
		this.atkMod = atkMod;
	}

	public Integer getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(Integer moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	public Integer getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(Integer swimSpeed) {
		this.swimSpeed = swimSpeed;
	}

	public Integer getClimbSpeed() {
		return climbSpeed;
	}

	public void setClimbSpeed(Integer climbSpeed) {
		this.climbSpeed = climbSpeed;
	}

	public Integer getFlySpeed() {
		return flySpeed;
	}

	public void setFlySpeed(Integer flySpeed) {
		this.flySpeed = flySpeed;
	}

//	public Integer getStr() {
//		return str;
//	}
//
//	public void setStr(Integer str) {
//		this.str = str;
//	}
//
//	public Integer getStrMod() {
//		return strMod;
//	}
//
//	public void setStrMod(Integer strMod) {
//		this.strMod = strMod;
//	}
//
//	public Integer getDex() {
//		return dex;
//	}
//
//	public void setDex(Integer dex) {
//		this.dex = dex;
//	}
//
//	public Integer getDexMod() {
//		return dexMod;
//	}
//
//	public void setDexMod(Integer dexMod) {
//		this.dexMod = dexMod;
//	}
//
//	public Integer getCon() {
//		return con;
//	}
//
//	public void setCon(Integer con) {
//		this.con = con;
//	}
//
//	public Integer getConMod() {
//		return conMod;
//	}
//
//	public void setConMod(Integer conMod) {
//		this.conMod = conMod;
//	}
//
//	public Integer getWis() {
//		return wis;
//	}
//
//	public void setWis(Integer wis) {
//		this.wis = wis;
//	}
//
//	public Integer getWisMod() {
//		return wisMod;
//	}
//
//	public void setWisMod(Integer wisMod) {
//		this.wisMod = wisMod;
//	}
//
//	public Integer getIntel() {
//		return intel;
//	}
//
//	public void setIntel(Integer intel) {
//		this.intel = intel;
//	}
//
//	public Integer getIntMod() {
//		return intMod;
//	}
//
//	public void setIntMod(Integer intMod) {
//		this.intMod = intMod;
//	}
//
//	public Integer getCha() {
//		return cha;
//	}
//
//	public void setCha(Integer cha) {
//		this.cha = cha;
//	}
//
//	public Integer getChaMod() {
//		return chaMod;
//	}
//
//	public void setChaMod(Integer chaMod) {
//		this.chaMod = chaMod;
//	}
//
//	public Integer getStrSave() {
//		return strSave;
//	}
//
//	public void setStrSave(Integer strSave) {
//		this.strSave = strSave;
//	}
//
//	public Integer getDexSave() {
//		return dexSave;
//	}
// 
//	public void setDexSave(Integer dexSave) {
//		this.dexSave = dexSave;
//	}
//
//	public Integer getConSave() {
//		return conSave;
//	}
//
//	public void setConSave(Integer conSave) {
//		this.conSave = conSave;
//	}
//
//	public Integer getWisSave() {
//		return wisSave;
//	}
//
//	public void setWisSave(Integer wisSave) {
//		this.wisSave = wisSave;
//	}
//
//	public Integer getIntSave() {
//		return intSave;
//	}
//
//	public void setIntSave(Integer intSave) {
//		this.intSave = intSave;
//	}
//
//	public Integer getChaSave() {
//		return chaSave;
//	}
//
//	public void setChaSave(Integer chaSave) {
//		this.chaSave = chaSave;
//	}

	public Integer getPassivePerc() {
		return passivePerc;
	}

	public void setPassivePerc(Integer passivePerc) {
		this.passivePerc = passivePerc;
	}

	public Integer getPassiveInsight() {
		return passiveInsight;
	}

	public void setPassiveInsight(Integer passiveInsight) {
		this.passiveInsight = passiveInsight;
	}

	public Integer getPassiveInvest() {
		return passiveInvest;
	}

	public void setPassiveInvest(int passiveInvest) {
		this.passiveInvest = passiveInvest;
	}

//	public Integer getAcrobatics() {
//		return acrobatics;
//	}
//
//	public void setAcrobatics(Integer acrobatics) {
//		this.acrobatics = acrobatics;
//	}
//
//	public Integer getAnimalHandling() {
//		return animalHandling;
//	}
//
//	public void setAnimalHandling(Integer animalHandling) {
//		this.animalHandling = animalHandling;
//	}
//
//	public Integer getArcana() {
//		return arcana;
//	}
//
//	public void setArcana(Integer arcana) {
//		this.arcana = arcana;
//	}
//
//	public Integer getAthletics() {
//		return athletics;
//	}
//
//	public void setAthletics(Integer athletics) {
//		this.athletics = athletics;
//	}
//
//	public Integer getDeception() {
//		return deception;
//	}
//
//	public void setDeception(Integer deception) {
//		this.deception = deception;
//	}
//
//	public Integer getHistory() {
//		return history;
//	}
//
//	public void setHistory(Integer history) {
//		this.history = history;
//	}
//
//	public Integer getInsight() {
//		return insight;
//	}
//
//	public void setInsight(Integer insight) {
//		this.insight = insight;
//	}
//
//	public Integer getIntimidation() {
//		return intimidation;
//	}
//
//	public void setIntimidation(Integer intimidation) {
//		this.intimidation = intimidation;
//	}
//
//	public Integer getInvestigation() {
//		return investigation;
//	}
//
//	public void setInvestigation(Integer investigation) {
//		this.investigation = investigation;
//	}
//
//	public Integer getMedicine() {
//		return medicine;
//	}
//
//	public void setMedicine(Integer medicine) {
//		this.medicine = medicine;
//	}
//
//	public Integer getNature() {
//		return nature;
//	}
//
//	public void setNature(Integer nature) {
//		this.nature = nature;
//	}
//
//	public Integer getPerception() {
//		return perception;
//	}
//
//	public void setPerception(Integer perception) {
//		this.perception = perception;
//	}
//
//	public Integer getPerformance() {
//		return performance;
//	}
//
//	public void setPerformance(Integer performance) {
//		this.performance = performance;
//	}
//
//	public Integer getPersuasion() {
//		return persuasion;
//	}
//
//	public void setPersuasion(Integer persuasion) {
//		this.persuasion = persuasion;
//	}
//
//	public Integer getReligion() {
//		return religion;
//	}
//
//	public void setReligion(Integer religion) {
//		this.religion = religion;
//	}
//
//	public Integer getSlightOfHand() {
//		return slightOfHand;
//	}
//
//	public void setSlightOfHand(Integer slightOfHand) {
//		this.slightOfHand = slightOfHand;
//	}
//
//	public Integer getStealth() {
//		return stealth;
//	}
//
//	public void setStealth(Integer stealth) {
//		this.stealth = stealth;
//	}
//
//	public Integer getSurvival() {
//		return survival;
//	}
//
//	public void setSurvival(Integer survival) {
//		this.survival = survival;
//	}

//	public Integer getTotalAtks() {
//		return totalAtks;
//	}
//
//	public void setTotalAtks(Integer totalAtks) {
//		this.totalAtks = totalAtks;
//	}
//
//	public Integer getTotalAtksTaken() {
//		return totalAtksTaken;
//	}
//
//	public void setTotalAtksTaken(Integer totalAtksTaken) {
//		this.totalAtksTaken = totalAtksTaken;
//	}
//
//	public Integer getTotalTimesAtked() {
//		return totalTimesAtked;
//	}
//
//	public void setTotalTimesAtked(Integer totalTimesAtked) {
//		this.totalTimesAtked = totalTimesAtked;
//	}
//
//	public Integer getTotalHitsTaken() {
//		return totalHitsTaken;
//	}
//
//	public void setTotalHitsTaken(Integer totalHitsTaken) {
//		this.totalHitsTaken = totalHitsTaken;
//	}
//
//	public Integer getTotalHitsDodged() {
//		return totalHitsDodged;
//	}
//
//	public void setTotalHitsDodged(Integer totalHitsDodged) {
//		this.totalHitsDodged = totalHitsDodged;
//	}
//
//	public Integer getTotalKills() {
//		return totalKills;
//	}
//
//	public void setTotalKills(Integer totalKills) {
//		this.totalKills = totalKills;
//	}

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

	public Integer getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(Integer maxHp) {
		this.maxHp = maxHp;
	}

	public Integer getInitiative() {
		return initiative;
	}

	public void setInitiave(Integer initiative) {
		this.initiative = initiative;
	}

	public List<EncounterCombat> getEncounterCombat() {
		return encounterCombat;
	}

	public void setEncounterCombat(List<EncounterCombat> encounterCombat) {
		this.encounterCombat = encounterCombat;
	}
	
	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public Integer getCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(Integer currentHp) {
		this.currentHp = currentHp;
	}

//	public Integer getTotalCrits() {
//		return totalCrits;
//	}
//
//	public void setTotalCrits(Integer totalCrits) {
//		this.totalCrits = totalCrits;
//	}
//
//	public Integer getTotalCritFails() {
//		return totalCritFails;
//	}
//
//	public void setTotalCritFails(Integer totalCritFails) {
//		this.totalCritFails = totalCritFails;
//	}
//
//	public Integer getTotalMassiveDmgs() {
//		return totalMassiveDmgs;
//	}
//
//	public void setTotalMassiveDmgs(Integer totalMassiveDmgs) {
//		this.totalMassiveDmgs = totalMassiveDmgs;
//	}
//
//	public Integer getTimesGoneDown() {
//		return timesGoneDown;
//	}
//
//	public void setTimesGoneDown(Integer timesGoneDown) {
//		this.timesGoneDown = timesGoneDown;
//	}
//
//	public Integer getTotalHits() {
//		return totalHits;
//	}
//
//	public void setTotalHits(Integer totalHits) {
//		this.totalHits = totalHits;
//	}
//
//	public Integer getTotalMisses() {
//		return totalMisses;
//	}
//
//	public void setTotalMisses(Integer totalMisses) {
//		this.totalMisses = totalMisses;
//	}
//
//	public Integer getTotalDmgDone() {
//		return totalDmgDone;
//	}

//	public void setTotalDmgDone(Integer totalDmgDone) {
//		this.totalDmgDone = totalDmgDone;
//	}
//
//	public Integer getTotalDmgTaken() {
//		return totalDmgTaken;
//	}
//
//	public void setTotalDmgTaken(Integer totalDmgTaken) {
//		this.totalDmgTaken = totalDmgTaken;
//	}
//
//	public Integer getTotalCombats() {
//		return totalCombats;
//	}
//
//	public void setTotalCombats(Integer totalCombats) {
//		this.totalCombats = totalCombats;
//	}
//
//	public void setInitiative(Integer initiative) {
//		this.initiative = initiative;
//	}

//	@Override
//	public String toString() {
//		return "Pc [id=" + id + ", name=" + name + ", level=" + level + ", perceptionMod=" + perceptionMod
//				+ ", insightMod=" + insightMod + ", ac=" + ac + ", maxHp=" + maxHp + ", initiative=" + initiative
//				+ ", encounterCombat=" + encounterCombat + "]";
//	}
	
	
}
