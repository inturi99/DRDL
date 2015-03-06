package com.technoidentity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;
@Entity
@Table(name = "project")
@Proxy(lazy = false)
public class Project {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "projectName")
	private String projectName;

	@Column(name = "projectCode")
	private String projectCode;

	@Column(name = "projectDirector")
	private String projectDirector;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectDirector() {
		return projectDirector;
	}

	public void setProjectDirector(String projectDirector) {
		this.projectDirector = projectDirector;
	}
	
}
