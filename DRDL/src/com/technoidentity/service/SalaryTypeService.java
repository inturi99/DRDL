package com.technoidentity.service;

import java.util.List;
import com.technoidentity.dto.SalaryTypeDto;

public interface SalaryTypeService {
	
	public List<SalaryTypeDto> findBySalaryType(String employeeNumber,String name);

}
