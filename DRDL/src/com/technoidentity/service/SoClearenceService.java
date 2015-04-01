package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.SoClearenceDto;

public interface  SoClearenceService{
	 public void addSoClearence(SoClearenceDto soClearenceDto);
	 public SoClearenceDto getId(String id);
	 
	 public void editSoClearence(SoClearenceDto soClearenceDto);
	    public List<SoClearenceDto> listSoClearence();
	    public List<SoClearenceDto> listSoClearenceOfficer();

}
