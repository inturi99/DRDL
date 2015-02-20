package com.technoidentity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;
@Entity
@Table(name="Vendor")
@Proxy(lazy=false)
public class Vendor {
@Id
@GeneratedValue
@Column(name="id")
private Integer id;
@Column(name="vendorCode")
private String vendorCode;
@Column(name="vendorName")
private String vendorName;
@Column(name="address")
private String address;
@Column(name="phoneNumber")
private Long phoneNumber;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getVendorCode() {
	return vendorCode;
}
public void setVendorCode(String vendorCode) {
	this.vendorCode = vendorCode;
}
public String getVendorName() {
	return vendorName;
}
public void setVendorName(String vendorName) {
	this.vendorName = vendorName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}

}
