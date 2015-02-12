package com.technoidentity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Proxy;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "ProjectManager")
@Proxy(lazy=false)
public class ProjectManager {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "pmcode")
	@Size(min = 2, max = 30)
	private String pmcode;

	@Column(name = "name")
	@Size(min = 2, max = 30)
	private String name;

	@Column(name = "grade")
	private String grade;
	@Column(name = "designation")
	@Size(min = 2, max = 30)
	private String designation;

	@Email
	@Column(name = "email")
	private String email;

	@Column(name = "phoneNumber")
	@Pattern(regexp = "^[0-9]{6,14}$")
	private String phoneNumber;

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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
  
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

}
