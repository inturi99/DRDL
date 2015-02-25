package com.technoidentity.dao;

import com.technoidentity.model.Employee;
import com.technoidentity.model.MonthlyAttendence;

public interface MonthlyAttendenceDao {
	public void addAttendence(MonthlyAttendence monthlyAttendence);
	    public void updateAttendence(MonthlyAttendence monthlyAttendence);
	    public MonthlyAttendence getMonthlyAttendenceId(Integer id);
	    public Employee getEmployeeId(Integer id);
	   
}
