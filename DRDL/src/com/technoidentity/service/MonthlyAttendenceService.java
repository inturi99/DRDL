package com.technoidentity.service;

import com.technoidentity.dto.MonthlyAttendenceDto;

public interface MonthlyAttendenceService {
	public void addAttendence(MonthlyAttendenceDto monthlyAttendenceDto);
    public void updateAttendence(MonthlyAttendenceDto monthlyAttendenceDto);
    public MonthlyAttendenceDto getEmployeeId(String id);
	

}
