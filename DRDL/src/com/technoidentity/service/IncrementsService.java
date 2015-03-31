package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.IncrementsDto;

public interface IncrementsService {
	public void addIncrement(IncrementsDto incrementsDto);
	 public List<IncrementsDto> findByEmployeeId(String employeeId);
   
}
