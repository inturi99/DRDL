package com.technoidentity.dao;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.Employee;
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
	public List<MonthlyAttendance> getAll(Integer employeeId) {
      
		Employee employee = (Employee)sessionFactory.getCurrentSession().createQuery("FROM Employee as e LEFT JOIN FETCH  e.monthlyAttendance WHERE e.id="+employeeId).uniqueResult();
		
		// Retrieve all
		return  new ArrayList<MonthlyAttendance>(employee.getMonthlyAttendances());
	
	}

}
