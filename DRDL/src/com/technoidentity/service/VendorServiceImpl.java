package com.technoidentity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.VendorDao;
import com.technoidentity.dto.VendorDto;
import com.technoidentity.model.Vendor;

@Service
public class VendorServiceImpl implements VendorService {
	@Autowired
	private VendorDao vendorDao;

	@Transactional
	public void addVendor(VendorDto vendorDto) {
		try{
		Vendor vendor = new Vendor();
		vendor.setVendorCode(vendorDto.getVendorCode());
		vendor.setVendorName(vendorDto.getVendorName());
		vendor.setAddress(vendorDto.getAddress());
		/*String phn=vendorDto.getPhoneNumber();
		Long pn=Long.valueOf(phn);
		vendor.setPhoneNumber(pn);
		*/
		vendor.setPhoneNumber(vendorDto.getPhoneNumber());
		vendor.setStatus(vendorDto.getStatus());
		vendorDao.addVendor(vendor);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Transactional
	public void updateVendor(VendorDto vendorDto) {
		try{

		Vendor vendor = vendorDao.getVendorId(new Integer(vendorDto.getId()));
		vendor.setVendorCode(vendorDto.getVendorCode());
		vendor.setVendorName(vendorDto.getVendorName());
		vendor.setAddress(vendorDto.getAddress());
		vendor.setStatus(vendorDto.getStatus());
     	vendorDao.updateVendor(vendor);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Transactional
	public VendorDto getVendorId(String id) {
		Vendor vendor = vendorDao.getVendorId(new Integer(id));
		VendorDto vendorDto = new VendorDto();
		vendorDto.setId(vendor.getId().toString());
		vendorDto.setVendorCode(vendor.getVendorCode());
		vendorDto.setVendorName(vendor.getVendorName());
		vendorDto.setAddress(vendor.getAddress());
		vendorDto.setPhoneNumber(vendor.getPhoneNumber());
		vendorDto.setStatus(vendor.getStatus());
		return vendorDto;
	}

	@Transactional
	public List<VendorDto> listVendors() {
		List<VendorDto> vendorDtoList = new ArrayList<VendorDto>();
		try {
			List<Vendor> vendorList = vendorDao.listVendors();
			for (Vendor vendor : vendorList) {
				VendorDto vendorDto = new VendorDto();
				vendorDto.setId(vendor.getId().toString());
				vendorDto.setVendorCode(vendor.getVendorCode());
				vendorDto.setVendorName(vendor.getVendorName());
				vendorDto.setAddress(vendor.getAddress());
				vendorDto.setPhoneNumber(vendor.getPhoneNumber());
				vendorDto.setStatus(vendor.getStatus());
				vendorDtoList.add(vendorDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vendorDtoList;

	}

	@Transactional
	public void removeVendor(Integer id) {
		// TODO Auto-generated method stub
    vendorDao.removeVendor(id);
	}

}
