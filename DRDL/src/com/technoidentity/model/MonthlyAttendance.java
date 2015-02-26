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
@Table(name = "monthlyAttendance")
@Proxy(lazy = false)
public class MonthlyAttendance {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name="date")
	private Date date;
	@Column(name="prasent")
	private Integer prasent;
	@Column(name="absent")
	private Integer absent;
	@Column(name="late")
	private Integer late;
	@ManyToOne
    private Employee employee;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
