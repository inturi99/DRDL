package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.PdSanctionDto;

public interface  PdSanctionService{
	 public void addPdSanction(PdSanctionDto pdSanctionDto);
	 public PdSanctionDto getId(String id);
	 public void editPdSanction(PdSanctionDto pdSanctionDto);
	 public List<PdSanctionDto> listPdSanction();
	 public List<PdSanctionDto> findByPropCode(String propcode);
}
