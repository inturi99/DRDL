package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(employee);
	}

	@Override
	public List<Employee> listEmployees() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();

	}

	@Override
	public void removeEmploye(Integer id) {
		 Employee employee = (Employee) sessionFactory.getCurrentSession().load(
	                Employee.class, id);
	        if (null != employee) {
	            sessionFactory.getCurrentSession().delete(employee);
	        }

		
	}

	@Override
	public Employee getEmployeeId(Integer id) {
		// TODO Auto-generated method stub
		Employee employee=(Employee)sessionFactory.getCurrentSession().load(Employee.class, new Integer(id));
		return employee;
	}

	@Override
	public List<Employee> findByName(String name) {
		return sessionFactory.getCurrentSession().createCriteria(Employee.class)
				.add(Restrictions.like("name",name +"%").ignoreCase()).list();
	}

	@Override
	public List<Employee> getEmployeeByEmployeeId(Integer id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Employee where id =:id").setParameter("id", id).list();
	}
	

}
