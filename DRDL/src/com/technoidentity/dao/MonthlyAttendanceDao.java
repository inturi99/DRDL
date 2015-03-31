package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.MonthlyAttendance;

public interface MonthlyAttendanceDao {
	public void addAttendence(MonthlyAttendance monthlyAttendence);
	 public List<MonthlyAttendance>  getEmployeeByEmployeeId(Integer employeeId);
	   
}
