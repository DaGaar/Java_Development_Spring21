package com.gaar.dmhelper.DmHelper.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gaar.dmhelper.DmHelper.Model.Npc;
import com.gaar.dmhelper.DmHelper.Model.Pc;
import com.gaar.dmhelper.DmHelper.Service.NpcService;
import com.gaar.dmhelper.DmHelper.Service.PcService;

@Controller
@RequestMapping("api/v1")
public class PcController {
	
	@Autowired
	private PcService pcService;
	@Autowired
	private NpcService npcService;
	
	@GetMapping("pcForm")
	public String pcForm() {
		System.out.println("inside PcController pcForm()");
		return "pc.html";
	}
	
	@GetMapping("encounterOccupants")
	public String getPcs(Model model) {
		List<Pc> pcs = pcService.findAll();
		model.addAttribute("pcs", pcs);
		List<Npc> npcs = npcService.findAll();
		model.addAttribute("npcs", npcs);
		System.out.println("inside PcController getPcs");
		return "EncounterOccupants.html";
	}
	
	@GetMapping("addPc")
	public String addPc(Pc pc) {
		pcService.saveAndFlush(pc);
		System.out.println("inside PcController addPc");
		return "pc.html";
	}

}
