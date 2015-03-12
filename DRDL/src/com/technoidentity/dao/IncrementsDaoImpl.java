package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.Increments;
@Repository
public class IncrementsDaoImpl implements IncrementsDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addIncrement(Increments increments) {
		sessionFactory.getCurrentSession().save(increments);
	}

	@Override
	public List<Increments> findByEmployeeId(Integer employeeId) {	
	return  sessionFactory.getCurrentSession().createQuery("from Increments where employee_id =:employeeId").setParameter("employeeId", employeeId).list();
	}
	
	

}
