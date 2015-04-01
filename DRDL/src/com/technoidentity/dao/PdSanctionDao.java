package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.PdSanction;

public interface PdSanctionDao {
	 public void addPdSanction(PdSanction pdSanction);

	 public void editPdSanction(PdSanction pdSanction);
	   public PdSanction getId(Integer id);
	   
	    public List<PdSanction> listPdSanction();
	    public List<PdSanction> findByPropCode(String propcode);
	    
}
