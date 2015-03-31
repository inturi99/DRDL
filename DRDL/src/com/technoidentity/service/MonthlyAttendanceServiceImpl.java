package com.technoidentity.service;

import java.util.ArrayList;
import java.util.List;

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
	@Transactional(readOnly=false)
	public void addAttendence(MonthlyAttendanceDto monthlyAttendanceDto) {
		try {
			// TODO Auto-generated method stub
			MonthlyAttendance monthlyAttendance = new MonthlyAttendance();
			Employee employee = employeeDao.getEmployeeId(new Integer(
					monthlyAttendanceDto.getEmployeeId()));
			monthlyAttendance.setEmployee(employee);
			monthlyAttendance.setDate(monthlyAttendanceDto.getDate());
			monthlyAttendance.setPrasent(monthlyAttendanceDto.getPrasent());
			monthlyAttendance.setAbsent(monthlyAttendanceDto.getAbsent());
			monthlyAttendance.setLate(monthlyAttendanceDto.getLate());
			monthlyAttendanceDao.addAttendence(monthlyAttendance);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Transactional(readOnly=false)
	public List<MonthlyAttendanceDto> getEmployeeByEmployeeId(String employeeId) {
		List<MonthlyAttendanceDto> monthlyAttendanceDtoList = new ArrayList<MonthlyAttendanceDto>();
		  
		try {
			List<MonthlyAttendance> monthlyAttendanceList = monthlyAttendanceDao
					.getEmployeeByEmployeeId(new Integer(employeeId));
			
			for (MonthlyAttendance monthlyAttendance : monthlyAttendanceList) {
				MonthlyAttendanceDto monthlyAttendanceDto = new MonthlyAttendanceDto();
				Employee employee =(Employee) employeeDao.getEmployeeId(new Integer(employeeId));
				
				monthlyAttendanceDto.setEmployeeId(employee.getId().toString());
				monthlyAttendanceDto.setEmployeeName(employee.getName());
				monthlyAttendanceDto.setSalary(employee.getSalary());
				monthlyAttendanceDto.setDate(monthlyAttendance.getDate());
				monthlyAttendanceDto.setPrasent(monthlyAttendance.getPrasent());
				monthlyAttendanceDto.setAbsent(monthlyAttendance.getAbsent());
				monthlyAttendanceDto.setLate(monthlyAttendance.getLate());
				monthlyAttendanceDtoList.add(monthlyAttendanceDto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return monthlyAttendanceDtoList;
	}

}
