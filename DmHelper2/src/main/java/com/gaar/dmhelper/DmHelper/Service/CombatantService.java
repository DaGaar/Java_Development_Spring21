package com.gaar.dmhelper.DmHelper.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaar.dmhelper.DmHelper.DAO.CombatantDAO;
import com.gaar.dmhelper.DmHelper.Model.Combatant;

import Exception.ResourceNotFoundException;

@Service
public class CombatantService {

	@Autowired
	private CombatantDAO combatantDAO;
	
	public List<Combatant> findAll() {
		return combatantDAO.findAll();
	}
	
	public Combatant save(Combatant combatant) {
		return combatantDAO.saveAndFlush(combatant);
	}
	
	public Combatant findById(Long id) {
		return combatantDAO.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Combatant not "
						+ "found with id: " + id));
	}
	
}
