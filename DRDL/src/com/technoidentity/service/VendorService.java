package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.VendorDto;

public interface VendorService {
	public void addVendor(VendorDto vendorDto);
	public void updateVendor(VendorDto vendorDto);
	public VendorDto getVendorId(String id);
	public List<VendorDto> listVendors();
	public void removeVendor(Integer id);
}
