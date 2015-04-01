package com.technoidentity.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class SoClearenceDto{
	private String id;
	private String propcode;
	private String natureofjob;
	private Double amount;
	private String demandingofficer;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSodecision() {
		return sodecision;
	}
	public void setSodecision(String sodecision) {
		this.sodecision = sodecision;
	}
	
}