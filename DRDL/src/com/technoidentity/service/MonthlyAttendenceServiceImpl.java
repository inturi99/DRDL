package com.technoidentity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.MonthlyAttendenceDao;
import com.technoidentity.dto.MonthlyAttendenceDto;
import com.technoidentity.model.Employee;
import com.technoidentity.model.MonthlyAttendence;

@Service
public class MonthlyAttendenceServiceImpl implements MonthlyAttendenceService {
	@Autowired
	public MonthlyAttendenceDao monthlyAttendenceDao;

	@Transactional
	public void addAttendence(MonthlyAttendenceDto monthlyAttendenceDto)
	    {
		try {
			// TODO Auto-generated method stub
			MonthlyAttendence monthlyAttendence=new MonthlyAttendence();
			     
			monthlyAttendence.setDate(monthlyAttendenceDto.getDate());
			monthlyAttendence.setPrasent(monthlyAttendenceDto.getPrasent());
			monthlyAttendence.setAbsent(monthlyAttendenceDto.getAbsent());
			monthlyAttendence.setLate(monthlyAttendenceDto.getLate());
			monthlyAttendenceDao.addAttendence(monthlyAttendence);
                 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional
	public void updateAttendence(MonthlyAttendenceDto monthlyAttendenceDto) {
		try {
			// TODO Auto-generated method stub
			MonthlyAttendence monthlyAttendence = monthlyAttendenceDao.getMonthlyAttendenceId(new Integer(
					monthlyAttendenceDto.getId()));
			monthlyAttendence.setDate(monthlyAttendenceDto.getDate());
			monthlyAttendence.setPrasent(monthlyAttendenceDto.getPrasent());
			monthlyAttendence.setAbsent(monthlyAttendenceDto.getAbsent());
			monthlyAttendence.setLate(monthlyAttendenceDto.getLate());
			monthlyAttendenceDao.addAttendence(monthlyAttendence);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Transactional
	public MonthlyAttendenceDto getEmployeeId(String id) {
		MonthlyAttendenceDto monthlyAttendenceDto = new MonthlyAttendenceDto();
		try {
			Employee employee = monthlyAttendenceDao.getEmployeeId(new Integer(id));
			monthlyAttendenceDto.setEmployeeId(employee.getId().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return monthlyAttendenceDto;
	}

	
}
