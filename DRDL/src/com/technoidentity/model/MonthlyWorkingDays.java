package com.technoidentity.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "MonthlyWorkingDays")
@Proxy(lazy = false)
public class MonthlyWorkingDays {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "month")
	private Date month ;	
	@Column(name="workingdays")
	private Integer workingdays;
	@Column(name="Year")
	private Date year;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	public Integer getWorkingDays() {
		return workingdays;
	}
	public void setDays(Integer workingdays) {
		this.workingdays = workingdays;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	 
	
}