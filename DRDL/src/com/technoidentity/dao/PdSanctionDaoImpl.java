package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.PdSanction;

@Repository
public class PdSanctionDaoImpl implements PdSanctionDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addPdSanction(PdSanction pdSanction) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(pdSanction);
	}

	@Override
	public void editPdSanction(PdSanction pdSanction) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(pdSanction);
	}

	public List<PdSanction> listPdSanction() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession()
				.createQuery("from PdSanction").list();
	}

	@Override
	public PdSanction getId(Integer id) {
			PdSanction pdSanction=(PdSanction)sessionFactory.getCurrentSession().load(PdSanction.class, new Integer(id));
			return pdSanction;
				
	}
	}

