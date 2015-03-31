package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.MonthlyAttendanceDto;

public interface MonthlyAttendanceService {
	public void addAttendence(MonthlyAttendanceDto monthlyAttendanceDto);
	 public List<MonthlyAttendanceDto> getEmployeeByEmployeeId(String employeeId);
   
}
