package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	    public void updateEmployee(Employee employee);
	    public Employee getEmployeeId(Integer id);
	    public List<Employee> listEmployees();

	    public void removeEmploye(Integer id);

}
