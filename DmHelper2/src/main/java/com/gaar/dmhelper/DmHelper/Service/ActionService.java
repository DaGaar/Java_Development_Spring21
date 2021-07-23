package com.gaar.dmhelper.DmHelper.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaar.dmhelper.DmHelper.DAO.ActionDAO;
import com.gaar.dmhelper.DmHelper.Model.Action;
import com.gaar.dmhelper.DmHelper.Victim;

import Exception.ResourceNotFoundException;

@Service
public class ActionService {
	
	@Autowired
	private ActionDAO actionDAO;
	
	public List<Action> findAll() {
		return actionDAO.findAll();
	}
	
	public Action save(Action action) {
		return actionDAO.saveAndFlush(action);
	}
	
	public Action findById(Long id) {
		return actionDAO.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Action not "
						+ "found with id: " + id));
	}
	
	public List<Action> findByAttackerId(Long charId) {
		int test = 0;
		List<Action> actionsMade = new LinkedList<Action>();
		List<Action> actions = findAll();
		for (int i = 0; i < actions.size(); i++) {
			if (charId == actions.get(i).getAttackerId()) {
				actionsMade.add(actions.get(i));
				test++;
			}
		}
		System.out.println(test);
		return actionsMade;
	}
	
	public List<Action> findByAttackedId(Long charId) {
		List<Action> actionsMade = new LinkedList<Action>();
		List<Action> actions = findAll();
		for (int i = 0; i < actions.size(); i++) {
//			List<Victim> victim = actions.get(i).getVictims();
//			for (int j = 0; j < victim.size(); j++) {
//				if (charId == victim.get(j).getAtkedId()) {
//					actionsMade.add(actions.get(i));
//				}
//			}
			if (charId == actions.get(i).getAttackedId()) {
				actionsMade.add(actions.get(i));
			}
		}
		return actionsMade;
	}
	
}
