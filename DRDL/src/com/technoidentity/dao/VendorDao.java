package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.Vendor;

public interface VendorDao {
public void addVendor(Vendor vendor);
public void updateVendor(Vendor vendor);
public Vendor getVendorId(Integer id);
public List<Vendor> listVendors();
public void removeVendor(Integer id);
}
