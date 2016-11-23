package com.technoidentity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.EmployeeDao;
import com.technoidentity.dao.IncrementsDao;
import com.technoidentity.dto.SalaryTypeDto;
import com.technoidentity.model.Employee;
import com.technoidentity.model.Increments;

@Service
public class SalaryTypeServiceImpl implements SalaryTypeService {
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private IncrementsDao incrementsDao;

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public List<SalaryTypeDto> findBySalaryType(String employeeNumber,
			String name) {
		List<SalaryTypeDto> salaryTypeDtoList = new ArrayList<SalaryTypeDto>();
		try {
			SalaryTypeDto salaryTypeDto;
			List<Employee> employeeList = employeeDao
					.find(employeeNumber, name);
			for (Employee employee : employeeList) {
				salaryTypeDto = new SalaryTypeDto();
				salaryTypeDto.setEmployeeId(employee.getId().toString());
				salaryTypeDto.setName(employee.getName());
				salaryTypeDto.setEmployeeNumber(employee.getEmployeeNumber());
				List<Increments> incrementsList = incrementsDao
						.findByEmployeeId(new Integer(salaryTypeDto
								.getEmployeeId()));
				for (Increments increments : incrementsList) {
					salaryTypeDto.setIncrementDate(increments.getDateIncr());
					salaryTypeDto.setIncrement(increments.getIncrement());
				}
				salaryTypeDtoList.add(salaryTypeDto);
			}
         	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salaryTypeDtoList;
	}

}
