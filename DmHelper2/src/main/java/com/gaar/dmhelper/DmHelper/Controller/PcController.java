package com.gaar.dmhelper.DmHelper.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaar.dmhelper.DmHelper.Model.Npc;
import com.gaar.dmhelper.DmHelper.Model.Pc;
import com.gaar.dmhelper.DmHelper.Service.NpcService;
import com.gaar.dmhelper.DmHelper.Service.PcService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1")
public class PcController {
	
	@Autowired
	private PcService pcService;
	
//	@RequestMapping("pcForm")
//	public String pcForm() {
//		System.out.println("inside PcController pcForm()");
//		return "pc.html";
//	}
	
	@RequestMapping("/pcs")
	public List<Pc> getPcs() {
		System.out.println("inside PcController getPcs");
		return pcService.findAll();
	}
	
	@PostMapping("/pcs")
	public Pc createPc(@RequestBody Pc pc) {
		return pcService.save(pc);
	}
	
	// PUT REQUEST IS USED TO MODIFY AN EXISTING RECORD
	@PutMapping("/pcs/{id}")
	public ResponseEntity<Pc> updatePc(@PathVariable Long id, @RequestBody Pc pcDetails) {
		
		// STEP ONE: RETRIEVE STUDENT RECORD FROM THE DB USING ID
		Pc pc = pcService.findById(id);
		
		// STEP TWO: UPDATE RETRIEVED STUDENT WITH NEW STUDENT DETAILS
		pc.setName(pcDetails.getName());
		pc.setLevel(pcDetails.getLevel());
		pc.setPerceptionMod(pcDetails.getPerceptionMod());
		pc.setAc(pcDetails.getAc());
		pc.setCurrentHp(pcDetails.getCurrentHp());
		
		//STEP THREE: SAVE THE MODIFIED STUDENT RECORD TO THE DB
		Pc updatedPc = pcService.save(pc);
		
		//RETURN A RESPONSE CONTAINING OK AND THE UPDATED STUDENT RECORD
		return ResponseEntity.ok(updatedPc);
	}
	
	//TODO
	//Test getDmgTaken method
//	@PutMapping("/pcs/dmg{id}")
//	public Pc currentHp(@PathVariable Long id, @RequestBody Pc pcDetails) {
//		
//		Pc pc = pcService.findById(id);
//		
//		return pcService.getDmgTaken(Pc pc);
//	}

}
