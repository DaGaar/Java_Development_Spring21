package com.gaar.dmhelper.DmHelper.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaar.dmhelper.DmHelper.DAO.PcDAO;
import com.gaar.dmhelper.DmHelper.Model.Pc;
import Exception.ResourceNotFoundException;

@Service
public class PcService {

	@Autowired
	private PcDAO pcDAO;
	
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
}
