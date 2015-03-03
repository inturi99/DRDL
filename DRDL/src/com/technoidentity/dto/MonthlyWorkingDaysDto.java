package com.technoidentity.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class MonthlyWorkingDaysDto {
	private String Id;
	@DateTimeFormat(pattern = "MM")
	private Date month;
	private Integer workingdays;
	@DateTimeFormat(pattern = "yyyy")
	private Date year;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	public Integer getWorkingdays() {
		return workingdays;
	}
	public void setWorkingdays(Integer workingdays) {
		this.workingdays = workingdays;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	
	}
