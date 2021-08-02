package com.gaar.dmhelper.DmHelper.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaar.dmhelper.DmHelper.Model.Combatant;
import com.gaar.dmhelper.DmHelper.Service.CombatantService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1")
public class CombatantController {

	@Autowired
	private CombatantService combatantService;
	
	@RequestMapping("/combatants")
	public List<Combatant> getCombatants() {
		return combatantService.findAll();
	}
	
	@PostMapping("/combatants")
	public Combatant createCombatant(@RequestBody Combatant combatant) {
		return combatantService.save(combatant);
	}
	
	@GetMapping("/combatants/{id}")
	public ResponseEntity<Combatant> getPcById(@PathVariable Long id) {
		Combatant combatant = combatantService.findById(id);
		return ResponseEntity.ok(combatant);
	}
}
