package com.technoidentity.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "Increments")
@Proxy(lazy = false)
public class Increments {
	@Id
	@GeneratedValue
	@Column(name ="id")
	private Integer id;
	@Column(name="dateIncr")
	private Date dateIncr;
	@Column(name="increment")
	private Double increment; 
	@ManyToOne
    private Employee employee;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
		
}
