package com.gaar.dmhelper.DmHelper.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaar.dmhelper.DmHelper.DAO.PcDAO;
import com.gaar.dmhelper.DmHelper.Model.Pc;

@Service
public class PcService {

	@Autowired
	private PcDAO pcDAO;
	
	public List<Pc> findAll() {
		System.out.println("inside PcService findAllmethod");
		return pcDAO.findAll();
	}
	
	public Pc saveAndFlush(Pc pc) {
		System.out.println("inside PcService saveAndFLush");
		return pcDAO.saveAndFlush(pc);
	}
}
