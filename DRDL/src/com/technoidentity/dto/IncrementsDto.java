package com.technoidentity.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class IncrementsDto {

	private String id;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateIncr;
	
	private Double increment; 
	
    private String employeeId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
}
