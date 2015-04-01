package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.SoClearence;

@Repository
public class SoClearenceDaoImpl implements SoClearenceDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addSoClearence(SoClearence soClearence) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(soClearence);
	}

	@Override
	public void editSoClearence(SoClearence soClearence) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(soClearence);
	}

	public List<SoClearence> listSoClearence() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession()
				.createQuery("from SoClearence").list();
	}

	@Override
	public SoClearence getId(Integer id) {
			SoClearence soClearence=(SoClearence)sessionFactory.getCurrentSession().load(SoClearence.class, new Integer(id));
			return soClearence;
				
	}

	@Override
	public List<SoClearence> listSoClearenceOfficer() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from SoClearence where sodecision like 'Ye%'").list();
	}
	}

