package com.technoidentity.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "SoClearence")
@Proxy(lazy = false)
public class SoClearence {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "propcode")
	private String propcode;

	@Column(name = "natureofjob")
	private String natureofjob;

	@Column(name = "amount")
	private Double amount;

	@Column(name = "demandingofficer")
	private String demandingofficer;

	@Column(name = "date1")
	private Date date;

	@Column(name = "sodecision")
	private String sodecision;

	public String getPropcode() {
		return propcode;
	}

	public void setPropcode(String propcode) {
		this.propcode = propcode;
	}

	public String getNatureofjob() {
		return natureofjob;
	}

	public void setNatureofjob(String natureofjob) {
		this.natureofjob = natureofjob;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDemandingofficer() {
		return demandingofficer;
	}

	public void setDemandingofficer(String demandingofficer) {
		this.demandingofficer = demandingofficer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSodecision() {
		return sodecision;
	}

	public void setSodecision(String sodecision) {
		this.sodecision = sodecision;
	}

}