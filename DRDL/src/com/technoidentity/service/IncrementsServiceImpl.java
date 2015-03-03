package com.technoidentity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.EmployeeDao;
import com.technoidentity.dao.IncrementsDao;
import com.technoidentity.dto.IncrementsDto;
import com.technoidentity.model.Employee;
import com.technoidentity.model.Increments;

@Service
public class IncrementsServiceImpl implements IncrementsService {
	@Autowired
	public IncrementsDao incrementsDao;
	@Autowired
	public EmployeeDao employeeDao;

	@Transactional
	public void addIncrement(IncrementsDto incrementsDto) {
		// TODO Auto-generated method stub
		
		Increments increments=new Increments();
		Employee employee=employeeDao.getEmployeeId(new Integer(incrementsDto.getEmployeeId()));     
		increments.setEmployee(employee);
		increments.setDateIncr(incrementsDto.getDateIncr());
		increments.setIncrement(incrementsDto.getIncrement());
		incrementsDao.addIncrement(increments);
		
		
	}
	
}
