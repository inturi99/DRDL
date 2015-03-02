package com.technoidentity.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class JobContractDto {
	private String id;
	private String jcpropcd;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date pdate;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date jcdate;
	private String job;
	private Double amt;
	private String receipt;
	private String paymode;
	private String employeeId;
	private String projectManagerId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getProjectManagerId() {
		return projectManagerId;
	}
	public void setProjectManagerId(String projectManagerId) {
		this.projectManagerId = projectManagerId;
	}
	
	
}
