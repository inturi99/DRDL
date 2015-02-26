package com.technoidentity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.EmployeeDao;
import com.technoidentity.dao.MonthlyAttendanceDao;
import com.technoidentity.dto.MonthlyAttendanceDto;
import com.technoidentity.model.Employee;
import com.technoidentity.model.MonthlyAttendance;

@Service
public class MonthlyAttendanceServiceImpl implements MonthlyAttendanceService {
	@Autowired
	public MonthlyAttendanceDao monthlyAttendanceDao;
	@Autowired
	public EmployeeDao employeeDao;

	@Transactional
	public void addAttendence(MonthlyAttendanceDto monthlyAttendanceDto)
	    {
		try {
			// TODO Auto-generated method stub
			MonthlyAttendance monthlyAttendance=new MonthlyAttendance();
			Employee employee=employeeDao.getEmployeeId(new Integer(monthlyAttendanceDto.getEmployeeId()));     
			monthlyAttendance.setEmployee(employee);
			monthlyAttendance.setDate(monthlyAttendanceDto.getDate());
			monthlyAttendance.setPrasent(new Integer(monthlyAttendanceDto.getPrasent()));
			monthlyAttendance.setAbsent(new Integer(monthlyAttendanceDto.getAbsent()));
			monthlyAttendance.setLate(new Integer(monthlyAttendanceDto.getLate()));
			monthlyAttendanceDao.addAttendence(monthlyAttendance);
                 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
