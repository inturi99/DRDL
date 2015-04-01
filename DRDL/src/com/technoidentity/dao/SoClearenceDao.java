package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.SoClearence;

public interface SoClearenceDao {
	 public void addSoClearence(SoClearence soClearence);

	 public void editSoClearence(SoClearence soClearence);
	 public SoClearence getId(Integer id);
	   
	    public List<SoClearence> listSoClearence();
      
	    public List<SoClearence> listSoClearenceOfficer();

	    
}
