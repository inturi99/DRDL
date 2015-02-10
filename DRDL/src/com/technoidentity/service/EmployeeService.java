package com.technoidentity.service;

import java.util.List;

import com.technoidentity.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);
	public Employee getEmployeeId(Integer id);
	public void updateEmpolyee(Employee employee);
    public List<Employee> listEmployees();

    public void removeEmloyee(Integer id);

}
