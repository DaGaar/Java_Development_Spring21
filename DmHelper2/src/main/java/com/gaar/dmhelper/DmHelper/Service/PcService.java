package com.gaar.dmhelper.DmHelper.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaar.dmhelper.DmHelper.DAO.PcDAO;
import com.gaar.dmhelper.DmHelper.Model.Action;
import com.gaar.dmhelper.DmHelper.Model.Pc;
import com.gaar.dmhelper.DmHelper.Model.Pc;

import Events.Actions;
import Exception.ResourceNotFoundException;

@Service
public class PcService {

	@Autowired
	private PcDAO pcDAO;
	
//	@Autowired
//	private Actions actions;
	
	public List<Pc> findAll() {
		System.out.println("inside PcService findAllmethod");
		return pcDAO.findAll();
	}
	
	public Pc save(Pc pc) {
		System.out.println("inside PcService saveAndFLush");
		return pcDAO.saveAndFlush(pc);
	}
	
	public Pc findById(Long id) {
		return pcDAO.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Pc not "
						+ "found with id: " + id));
	}
	
	//TODO
//	public int getDmgTaken(Pc pc) {
//		int dmgTaken = 0;
//		List<Action> actions = pc.getActions();
//		//long id = pc.getId();
//		for (int i = 0; i < actions.size(); i++) {
//		//	long attackedId = actions.get(i).getAttacked().getId();
//			if (pc.getId() == actions.get(i).getAttacked().getId()) {
//				dmgTaken += actions.get(i).getDmgDone();
//			}
//		}
//		return dmgTaken;
//	}
	

	

}
