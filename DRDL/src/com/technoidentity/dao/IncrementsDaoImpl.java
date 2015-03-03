package com.technoidentity.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.Increments;
import com.technoidentity.model.MonthlyAttendance;
@Repository
public class IncrementsDaoImpl implements IncrementsDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addIncrement(Increments increments) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(increments);
	}
	
	

}
