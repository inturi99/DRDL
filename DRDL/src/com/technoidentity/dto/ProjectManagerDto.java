package com.technoidentity.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProjectManagerDto {
	private Integer id;

	private String pmcode;

	private String name;

	private String grade;
	private String designation;

	private String email;

	private String phoneNumber;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPmcode() {
		return pmcode;
	}

	public void setPmcode(String pmcode) {
		this.pmcode = pmcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
