package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.EmployeeDto;
import com.technoidentity.model.Employee;

public interface EmployeeService {
	public void addEmployee(EmployeeDto employeeDto);
	public EmployeeDto getEmployeeId(String id);
	public void updateEmpolyee(EmployeeDto employeeDto);
    public List<EmployeeDto> listEmployees();
    public List<EmployeeDto> findByFirstName(String name);
    public void removeEmloyee(Integer id);
    public List<EmployeeDto> listContractEmployee();
    public List<EmployeeDto> getEmployeeByEmployeeId(String employeeId);

}
