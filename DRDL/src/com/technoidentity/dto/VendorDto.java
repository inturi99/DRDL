package com.technoidentity.dto;



public class VendorDto {
	private String id;	
	private String vendorCode;
	private String vendorName;
	private String address;
	private Long phoneNumber;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
