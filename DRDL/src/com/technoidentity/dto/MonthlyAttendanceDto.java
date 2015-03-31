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
	private String employeeName;
	private Double salary;
    private Date dateIncr;
	private Double increment; 
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
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getDateIncr() {
		return dateIncr;
	}
	public void setDateIncr(Date dateIncr) {
		this.dateIncr = dateIncr;
	}
	public Double getIncrement() {
		return increment;
	}
	public void setIncrement(Double increment) {
		this.increment = increment;
	}
	

}
