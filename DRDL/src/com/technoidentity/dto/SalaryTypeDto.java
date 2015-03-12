package com.technoidentity.dto;

import java.util.Date;

public class SalaryTypeDto {
private String employeeId;
private String name;
private String employeeNumber;
private Date incrementDate;
private Double increment; 
public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmployeeNumber() {
	return employeeNumber;
}
public void setEmployeeNumber(String employeeNumber) {
	this.employeeNumber = employeeNumber;
}
public Date getIncrementDate() {
	return incrementDate;
}
public void setIncrementDate(Date incrementDate) {
	this.incrementDate = incrementDate;
}
public Double getIncrement() {
	return increment;
}
public void setIncrement(Double increment) {
	this.increment = increment;
}

}
