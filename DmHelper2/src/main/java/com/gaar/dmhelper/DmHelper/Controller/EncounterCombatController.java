package com.gaar.dmhelper.DmHelper.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaar.dmhelper.DmHelper.DAO.EncounterCombatDAO;

@RestController
public class EncounterCombatController {

	@Autowired
	EncounterCombatDAO encounterCombatDAO;
	
	@RequestMapping("/encounter")
	public String encounterCombat() {
		System.out.println("inside EncounterCombatController encounterCombat");
		return "EncounterOccupants.html";
	}
}
