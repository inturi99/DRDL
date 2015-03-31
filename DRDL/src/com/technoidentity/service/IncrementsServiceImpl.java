package com.technoidentity.service;

import java.util.ArrayList;
import java.util.List;

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

	@Transactional(readOnly=false)
	public List<IncrementsDto> findByEmployeeId(String employeeId) {
		List<IncrementsDto> incrementsDtoList = new ArrayList<IncrementsDto>();
		try{
			List<Increments> incrementsList =incrementsDao.findByEmployeeId(new Integer(employeeId));
					for(Increments increments:incrementsList){
						IncrementsDto incrementsDto=new IncrementsDto();
						Employee employee =(Employee) employeeDao.getEmployeeId(new Integer(employeeId));
						incrementsDto.setEmployeeId(employee.getId().toString());
						incrementsDto.setDateIncr(increments.getDateIncr());
						incrementsDto.setIncrement(increments.getIncrement());
						incrementsDtoList.add(incrementsDto);
						
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return incrementsDtoList;
	}
	
}
