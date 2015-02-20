package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.Vendor;

@Repository
public class VendorDaoImpl implements VendorDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(vendor);
	}

	@Override
	public void updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(vendor);
	}

	@Override
	public Vendor getVendorId(Integer id) {
		// TODO Auto-generated method stub
		Vendor vendor = (Vendor) sessionFactory.getCurrentSession().load(
				Vendor.class, new Integer(id));
		return vendor;
	}

	@Override
	public List<Vendor> listVendors() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Vendor")
				.list();
	}

	@Override
	public void removeVendor(Integer id) {
		// TODO Auto-generated method stub
		Vendor vendor = (Vendor) sessionFactory.getCurrentSession().load(
				Vendor.class, new Integer(id));
		if (vendor != null) {
			sessionFactory.getCurrentSession().delete(vendor);
		}
	}

}
