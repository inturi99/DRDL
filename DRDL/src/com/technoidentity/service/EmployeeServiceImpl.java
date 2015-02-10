package com.technoidentity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.EmployeeDao;
import com.technoidentity.model.Employee;
@Service
public class EmployeeServiceImpl  implements EmployeeService{
    @Autowired
	public EmployeeDao employeeDao;
	@Transactional
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.addEmployee(employee);
	}
	@Transactional
	public void updateEmpolyee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.updateEmployee(employee);
	}
	@Transactional
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.listEmployees();
	}
	@Transactional
	public void removeEmloyee(Integer id) {
		// TODO Auto-generated method stub
		employeeDao.removeEmploye(id);
	}
	@Transactional
	public Employee getEmployeeId(Integer id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeId(id);
	}

}
