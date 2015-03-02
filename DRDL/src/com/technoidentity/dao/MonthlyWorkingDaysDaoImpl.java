package com.technoidentity.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.MonthlyWorkingDays;
@Repository
public class MonthlyWorkingDaysDaoImpl implements MonthlyWorkingDaysDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void saveMonthyWorkingDays(MonthlyWorkingDays monthlyWorkingDays) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(monthlyWorkingDays);
	}

}
