package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.MonthlyAttendance;
@Repository
public class MonthlyAttendanceDaoImpl implements MonthlyAttendanceDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addAttendence(MonthlyAttendance monthlyAttendence)
	 {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(monthlyAttendence);
	}

	@Override
	public List<MonthlyAttendance> getEmployeeByEmployeeId(Integer employeeId) {
      
			return  sessionFactory.getCurrentSession().createQuery("from MonthlyAttendance where employeeId =:employeeId").setParameter("employeeId", employeeId).list();
	
	}

}
