package com.technoidentity.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "PdSanction")
@Proxy(lazy = false)
public class PdSanction{
	@Id
	@GeneratedValue
	@Column(name ="id")
	private Integer id;
	@Column(name ="propcode")
	private String propcode;
	
	@Column(name="natureofjob")
	private String natureofjob;
		
	@Column(name ="amount")
	private Double amount;
	
	
	@Column(name ="demandingofficer")
	private String demandingofficer;
	
	@Column(name ="sanctioncode")
	private String sanctioncode;
	
	@Column(name="date1")
	private Date date;
	
	@Column(name ="pddecision")
	private String pddecision;

	@Column(name ="remarks")
	private String remarks;

	@Column(name ="description")
	private String description;

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
	
	
}