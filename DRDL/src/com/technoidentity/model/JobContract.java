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
@Table(name = "JobContract")
@Proxy(lazy = false)
public class JobContract {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "jcpropcd")
	private String jcpropcd;
	@Column(name="pdate")
	private Date pdate;
	@Column(name="jcdate")
	private Date jcdate;
	@Column(name = "job")
	private String job;
	@Column(name="amt")
	private Double amt;
	@Column(name = "receipt")
	private String receipt;
	@Column(name = "paymode")
	private String paymode;
	@ManyToOne
    private Employee employee;
	@ManyToOne
    private ProjectManager projectManager;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJcpropcd() {
		return jcpropcd;
	}
	public void setJcpropcd(String jcpropcd) {
		this.jcpropcd = jcpropcd;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public Date getJcdate() {
		return jcdate;
	}
	public void setJcdate(Date jcdate) {
		this.jcdate = jcdate;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getAmt() {
		return amt;
	}
	public void setAmt(Double amt) {
		this.amt = amt;
	}
	public String getReceipt() {
		return receipt;
	}
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	public String getPaymode() {
		return paymode;
	}
	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public ProjectManager getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(ProjectManager projectManager) {
		this.projectManager = projectManager;
	}
	
}
