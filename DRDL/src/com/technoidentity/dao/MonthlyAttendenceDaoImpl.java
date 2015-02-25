package com.technoidentity.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.Employee;
import com.technoidentity.model.MonthlyAttendence;
@Repository
public class MonthlyAttendenceDaoImpl implements MonthlyAttendenceDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addAttendence(MonthlyAttendence monthlyAttendence)
	 {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(monthlyAttendence);
	}

	@Override
	public void updateAttendence(MonthlyAttendence monthlyAttendence) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(monthlyAttendence);
	}
	

	@Override
	public MonthlyAttendence getMonthlyAttendenceId(Integer id) {
		// TODO Auto-generated method stub
		MonthlyAttendence monthlyAttendence=(MonthlyAttendence)sessionFactory.getCurrentSession().load(MonthlyAttendence.class, new Integer(id));
		return monthlyAttendence;
	}
	@Override
	public Employee getEmployeeId(Integer id) {
		// TODO Auto-generated method stub
		Employee employee=(Employee)sessionFactory.getCurrentSession().load(Employee.class, new Integer(id));
		return employee;
	}

}
