package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	    public void updateEmployee(Employee employee);
	    public Employee getEmployeeId(Integer id);
	    public List<Employee> listEmployees();
        public List<Employee> findByName(String name);
        public List<Employee> find(String employeeNumber,String name);
	    public void removeEmploye(Integer id);
	    public List<Employee> listcontractEmployees();
	    public List<Employee> getEmployeeByEmployeeId(Integer id);
	    
	    public Employee getEmploeeAttendance(Integer id);

}
