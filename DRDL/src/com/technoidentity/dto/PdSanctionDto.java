package com.technoidentity.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class PdSanctionDto{
	private String id;
	private String propcode;
	private String natureofjob;
	private Double amount;
	private String demandingofficer;
	private String sanctioncode;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	private String pddecision;
	private String remarks;
	private String description;

	
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
	public String getSanctioncode() {
		return sanctioncode;
	}
	public void setSanctioncode(String sanctioncode) {
		this.sanctioncode = sanctioncode;
	}
	public String getPddecision() {
		return pddecision;
	}
	public void setPddecision(String pddecision) {
		this.pddecision = pddecision;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}