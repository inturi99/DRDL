package com.technoidentity.dto;

import java.util.Date;


public class IncrementsDto {

	private String id;
	
	private Date dateIncr;
	
	private Double increment; 
	
    private Integer employeeId;

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

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
}
