package com.technoidentity.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class MonthlyAttendanceDto {
	
	private String id;
	@DateTimeFormat(pattern = "MM/yyyy")
	private Date date;
	private Integer prasent;
	private Integer absent;
	private Integer late;
	private String employeeId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public Integer getPrasent() {
		return prasent;
	}
	public void setPrasent(Integer prasent) {
		this.prasent = prasent;
	}
	public Integer getAbsent() {
		return absent;
	}
	public void setAbsent(Integer absent) {
		this.absent = absent;
	}
	public Integer getLate() {
		return late;
	}
	public void setLate(Integer late) {
		this.late = late;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	

}
