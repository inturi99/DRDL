package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.EmployeeDto;
import com.technoidentity.model.Employee;

public interface EmployeeService {
	public void addEmployee(EmployeeDto employeeDto);
	public Employee getEmployeeId(String id);
	public void updateEmpolyee(EmployeeDto employeeDto);
    public List<EmployeeDto> listEmployees();

    public void removeEmloyee(Integer id);

}
