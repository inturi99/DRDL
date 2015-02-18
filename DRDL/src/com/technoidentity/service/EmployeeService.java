package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.EmployeeDto;
import com.technoidentity.model.Employee;

public interface EmployeeService {
	public void addEmployee(EmployeeDto employeeDto);
	public Employee getEmployeeId(Integer id);
	public void updateEmpolyee(EmployeeDto employeeDto);
    public List<Employee> listEmployees();

    public void removeEmloyee(Integer id);

}
