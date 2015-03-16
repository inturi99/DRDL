package com.technoidentity.model;



import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Proxy;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "employee")
@Proxy(lazy = false)
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "empNo")
	private String employeeNumber;
	@Column(name = "name")
	@Size(min = 2, max = 30)
	private String name;
	
	@Column(name = "designation")
	@Size(min = 2, max = 30)
	private String designation;

	@Column(name = "project")
	@Size(min = 2, max = 30)
	private String project;

	@Email
	@Column(name = "email")
	private String email;

	@Column(name = "qual")
	@Size(min = 2, max = 20)
	private String qual;
	@Column(name = "lab")
	@Size(min = 2, max = 10)
	private String lab;

	@Column(name = "dob")
	private Date dob;
	@Column(name = "idcardno")
	@Size(min = 4, max = 6)
	private String idcardno;
	@Column(name = "doj")
	private Date doj;
	@Column(name = "dol")
	private Date dol;
	@Column(name = "wkc")
	@Size(min = 2, max = 15)
	private String wkc;
	@Column(name = "dept")
	@Size(min = 15, max = 100)
	private String dept;
	@Column(name = "pmcode")
	
	private Integer pmcode;
	@Column(name = "iboss")
	
	private Integer iboss;

	@Column(name = "resp")
	@Size(min = 0, max = 255)
	private String resp;
	@Column(name = "job")
	@Size(min = 0, max = 255)
	private String job;
	@Column(name = "salary")
	
	private Double salary;
	@Column(name = "paddress")
	@Size(min = 0, max = 255)
	private String paddress;

	@Column(name = "pphone")
	private Long pphone;
	@Column(name = "taddress")
	@Size(min = 0, max = 255)
	private String taddress;
	@Column(name = "tphone")
	private Long tphone;
	@Column(name = "type")
	@Size(min = 0, max = 10)
	private String type;
	/*@Column(name = "consigno")
	private Date consigno;
	
	@Column(name = "conexpon")
	private Date conexpon;*/
	
	@Column(name = "service")
	@Size(min = 0, max = 10)
	private String service;
	@Column(name = "wkcphone")
	@Size(min = 0, max = 13)
	private String wkcphone;
	@Column(name = "emptype")
	@Size(min = 1, max = 3)
	private String emptype;
	@Column(name = "password")
	@Size(min = 2, max = 8)
	private String password;
	@Column(name = "photo")
	@Lob
	private byte[] Photo;
	@Column(name = "catg")
	@Size(min = 0, max = 100)
	private String catg;
	@Column(name = "start_sal")
	private Integer start_sal;
	@Column(name = "board_type")
	@Size(min = 2, max = 4)
	private String board_type;
	@Column(name = "update_on")
	private Date update_on;
	@Column(name = "dot")
	private Date dot;
	@Column(name = "empid_new")
	@Size(min = 2, max = 5)
	private String empid_new;
	
	@Column(name = "mobile")
	private Long mobile;

	@Column(name = "verified")
	@Size(min = 2, max = 10)
	private String verified;
	@Column(name = "punch")
	@Size(min = 2, max = 5)
	private String punch;
	/* @OneToMany(mappedBy = "employee")
	 private List<MonthlyAttendance> monthlyAttendances;*/
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
    
	
	public Integer getPmcode() {
		return pmcode;
	}
	       
	/*public void setMonthlyAttendances(List<MonthlyAttendance> monthlyAttendances) {
		this.monthlyAttendances = monthlyAttendances;
	}

	public List<MonthlyAttendance> getMonthlyAttendances() {
		return monthlyAttendances;
	}*/

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer empid) {
		this.id = empid;
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



	public String getService() {
		return service;
	}

	public String getIdcardno() {
		return idcardno;
	}

	public void setIdcardno(String idcardno) {
		this.idcardno = idcardno;
	}

	public byte[] getPhoto() {
		return Photo;
	}

	public void setPhoto(byte[] photo) {
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
