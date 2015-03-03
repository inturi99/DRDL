package com.technoidentity.dto;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeeDto {

	private String id;
	private String employeeNumber;
	private String name;
	private String designation;
	private String project;
	private String email;
	private String qual;
	private String lab;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	private String idcardno;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date doj;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dol;
	private String wkc;
	private String dept;

	private Integer pmcode;

	private Integer iboss;
	private String resp;
	private String job;

	private Double salary;
	private String paddress;
	private Long pphone;
	private String taddress;
	private Long tphone;
	private String type;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date consigno;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date conexpon;
	private String service;
	private String wkcphone;
	private String emptype;
	private String password;
	private String Photo;
	private String catg;
	private Integer start_sal;
	private String board_type;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date update_on;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dot;
	private String empid_new;
	private Long mobile;

	private String verified;
	private String punch;
    
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
    
	
	public Integer getPmcode() {
		return pmcode;
	}

	public void setPmcode(Integer pmcode) {
		this.pmcode = pmcode;
	}

	public Integer getIboss() {
		return iboss;
	}

	public void setIboss(Integer iboss) {
		this.iboss = iboss;
	}

	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getStart_sal() {
		return start_sal;
	}

	public void setStart_sal(Integer start_sal) {
		this.start_sal = start_sal;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaddress() {
		return taddress;
	}

	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	public String getQual() {
		return qual;
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;

	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getDol() {
		return dol;
	}

	public void setDol(Date dol) {
		this.dol = dol;
	}

	public String getWkc() {
		return wkc;
	}

	public void setWkc(String wkc) {
		this.wkc = wkc;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public Long getPphone() {
		return pphone;
	}

	public void setPphone(Long pphone) {
		this.pphone = pphone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getTphone() {
		return tphone;
	}

	public void setTphone(Long tphone) {
		this.tphone = tphone;
	}

	public Date getConsigno() {
		return consigno;
	}

	public void setConsigno(Date consigno) {
		this.consigno = consigno;
	}

	public Date getConexpon() {
		return conexpon;
	}

	public void setConexpon(Date conexpon) {
		this.conexpon = conexpon;
	}

	public String getService() {
		return service;
	}

	public String getIdcardno() {
		return idcardno;
	}

	public void setIdcardno(String idcardno) {
		this.idcardno = idcardno;
	}

	public String getPhoto() {
		return Photo;
	}

	public void setPhoto(String photo) {
		Photo = photo;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getWkcphone() {
		return wkcphone;
	}

	public void setWkcphone(String wkcphone) {
		this.wkcphone = wkcphone;
	}

	public String getEmptype() {
		return emptype;
	}

	public void setEmptype(String emptype) {
		this.emptype = emptype;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCatg() {
		return catg;
	}

	public void setCatg(String catg) {
		this.catg = catg;
	}

	public String getBoard_type() {
		return board_type;
	}

	public void setBoard_type(String board_type) {
		this.board_type = board_type;
	}

	public Date getUpdate_on() {
		return update_on;
	}

	public void setUpdate_on(Date update_on) {
		this.update_on = update_on;
	}

	public Date getDot() {
		return dot;
	}

	public void setDot(Date dot) {
		this.dot = dot;
	}

	public String getEmpid_new() {
		return empid_new;
	}

	public void setEmpid_new(String empid_new) {
		this.empid_new = empid_new;
	}

	public String getVerified() {
		return verified;
	}

	public void setVerified(String verified) {
		this.verified = verified;
	}

	public String getPunch() {
		return punch;
	}

	public void setPunch(String punch) {
		this.punch = punch;
	}

}
