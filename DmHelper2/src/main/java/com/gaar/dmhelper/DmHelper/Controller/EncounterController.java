package com.gaar.dmhelper.DmHelper.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaar.dmhelper.DmHelper.Model.Encounter;
import com.gaar.dmhelper.DmHelper.Model.Pc;
import com.gaar.dmhelper.DmHelper.Service.EncounterService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1")
public class EncounterController {

	//TODO MAYBE JUST HAVE ENCOUNTER CLASS STORE LIST OF IDs, TYPE(AllY, ENEMY
	//, AND INITIATIVE
	
	@Autowired
	EncounterService encounterService;
	
	@RequestMapping("/encounters")
	public List<Encounter> getCombats() {
		return encounterService.findAll();
	}
	
	@PostMapping("/encounters")
	public Encounter createEncounter(@RequestBody Encounter encounter) {
		return encounterService.save(encounter);
	}
	
	@GetMapping("/encounters/{id}")
	public ResponseEntity<Encounter> getEncounterById(@PathVariable Long id) {
		Encounter encounter = encounterService.findById(id);
		return ResponseEntity.ok(encounter);
	}
	
	// PUT REQUEST IS USED TO MODIFY AN EXISTING RECORD
//		@PutMapping("/encounters/{id}")
//		public ResponseEntity<EncounterCombat> updateEncounter(@PathVariable 
//					Long id, @RequestBody EncounterCombat EncounterDetails) {
//			
//			// STEP ONE: RETRIEVE STUDENT RECORD FROM THE DB USING ID
//			EncounterCombat encounter = combatService.findById(id);
//			
//			// STEP TWO: UPDATE RETRIEVED STUDENT WITH NEW STUDENT DETAILS
//			encounter.setName(EncounterDetails.getName());
//			encounter.setLevel(EncounterDetails.getLevel());
//			encounter.setPerceptionMod(EncounterDetails.getPerceptionMod());
//			encounter.setAc(EncounterDetails.getAc());
//			encounter.setCurrentHp(EncounterDetails.getCurrentHp());
//			
//			//STEP THREE: SAVE THE MODIFIED STUDENT RECORD TO THE DB
//			EncounterCombat updatedEncounter = combatService.save(encounter);
//			
//			//RETURN A RESPONSE CONTAINING OK AND THE UPDATED STUDENT RECORD
//			return ResponseEntity.ok(updatedEncounter);
//		}
	
}
