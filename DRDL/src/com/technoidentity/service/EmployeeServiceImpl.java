package com.technoidentity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.EmployeeDao;
import com.technoidentity.dto.EmployeeDto;
import com.technoidentity.model.Employee;
@Service
public class EmployeeServiceImpl  implements EmployeeService{
    @Autowired
	public EmployeeDao employeeDao;
	@Transactional
	public void addEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setName(employeeDto.getName());
		employee.setDesignation(employeeDto.getDesignation());
		employee.setProject(employeeDto.getProject());
		employee.setEmail(employeeDto.getEmail());
		employee.setQual(employeeDto.getQual());
		employee.setLab(employeeDto.getLab());
		employee.setDob(employeeDto.getDob());
		employee.setIdcardno(employeeDto.getIdcardno());
		employee.setDoj(employeeDto.getDoj());
		employee.setDol(employeeDto.getDol());
		employee.setWkc(employeeDto.getWkc());
		employee.setDept(employeeDto.getDept());
		employee.setPmcode(employeeDto.getPmcode());
		employee.setIboss(employeeDto.getIboss());
		employee.setResp(employeeDto.getResp());
		employee.setJob(employeeDto.getJob());
		employee.setSalary(employeeDto.getSalary());
		employee.setPaddress(employeeDto.getPaddress());
		employee.setPphone(employeeDto.getPphone());
		employee.setTaddress(employeeDto.getTaddress());
		employee.setTphone(employeeDto.getTphone());
		employee.setType(employeeDto.getType());
		employee.setConsigno(employeeDto.getConsigno());
		employee.setConexpon(employeeDto.getConexpon());
		employee.setService(employeeDto.getService());
		employee.setWkcphone(employeeDto.getWkcphone());
		employee.setEmptype(employeeDto.getEmptype());
		employee.setPassword(employeeDto.getPassword());
		employee.setPhoto(employeeDto.getPhoto());
		employee.setCatg(employeeDto.getCatg());
		employee.setStart_sal(employeeDto.getStart_sal());
		employee.setBoard_type(employeeDto.getBoard_type());
		employee.setUpdate_on(employeeDto.getUpdate_on());
		employee.setDot(employeeDto.getDot());
		employee.setEmpid_new(employeeDto.getEmpid_new());
		employee.setMobile(employeeDto.getMobile());
		employee.setVerified(employeeDto.getVerified());
		employee.setPunch(employeeDto.getPunch());
		
		
		employeeDao.addEmployee(employee);
	}
	@Transactional
	public void updateEmpolyee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee=employeeDao.getEmployeeId(employeeDto.getId());
		employee.setName(employeeDto.getName());
		employee.setDesignation(employeeDto.getDesignation());
		employee.setProject(employeeDto.getProject());
		employee.setEmail(employeeDto.getEmail());
		employee.setQual(employeeDto.getQual());
		employee.setLab(employeeDto.getLab());
		employee.setDob(employeeDto.getDob());
		employee.setIdcardno(employeeDto.getIdcardno());
		employee.setDoj(employeeDto.getDoj());
		employee.setDol(employeeDto.getDol());
		employee.setWkc(employeeDto.getWkc());
		employee.setDept(employeeDto.getDept());
		employee.setPmcode(employeeDto.getPmcode());
		employee.setIboss(employeeDto.getIboss());
		employee.setResp(employeeDto.getResp());
		employee.setJob(employeeDto.getJob());
		employee.setSalary(employeeDto.getSalary());
		employee.setPaddress(employeeDto.getPaddress());
		employee.setPphone(employeeDto.getPphone());
		employee.setTaddress(employeeDto.getTaddress());
		employee.setTphone(employeeDto.getTphone());
		employee.setType(employeeDto.getType());
		employee.setConsigno(employeeDto.getConsigno());
		employee.setConexpon(employeeDto.getConexpon());
		employee.setService(employeeDto.getService());
		employee.setWkcphone(employeeDto.getWkcphone());
		employee.setEmptype(employeeDto.getEmptype());
		employee.setPassword(employeeDto.getPassword());
		employee.setPhoto(employeeDto.getPhoto());
		employee.setCatg(employeeDto.getCatg());
		employee.setStart_sal(employeeDto.getStart_sal());
		employee.setBoard_type(employeeDto.getBoard_type());
		employee.setUpdate_on(employeeDto.getUpdate_on());
		employee.setDot(employeeDto.getDot());
		employee.setEmpid_new(employeeDto.getEmpid_new());
		employee.setMobile(employeeDto.getMobile());
		employee.setVerified(employeeDto.getVerified());
		employee.setPunch(employeeDto.getPunch());
		employeeDao.updateEmployee(employee);
	}
	@Transactional
	public List<EmployeeDto> listEmployees() {
		// TODO Auto-generated method stub
		List<EmployeeDto> employeeDtoList=new ArrayList<EmployeeDto>();
		try{
		List<Employee> employeeList=employeeDao.listEmployees();
		for(Employee employee :employeeList){
			EmployeeDto employeeDto=new EmployeeDto();
			employeeDto.setId(employee.getId());
			employeeDto.setName(employee.getName());
			employeeDto.setDesignation(employee.getDesignation());
			employeeDto.setProject(employee.getProject());
			employeeDto.setEmail(employee.getEmail());
			employeeDto.setQual(employee.getQual());
			employeeDto.setLab(employee.getLab());
			employeeDto.setDob(employee.getDob());
			employeeDto.setIdcardno(employee.getIdcardno());
			employeeDto.setDoj(employee.getDoj());
			employeeDto.setDol(employee.getDol());
			employeeDto.setWkc(employee.getWkc());
			employeeDto.setDept(employee.getDept());
			employeeDto.setPmcode(employee.getPmcode());
			employeeDto.setIboss(employee.getIboss());
			employeeDto.setResp(employee.getResp());
			employeeDto.setJob(employee.getJob());
			employeeDto.setSalary(employee.getSalary());
			employeeDto.setPaddress(employee.getPaddress());
			employeeDto.setPphone(employee.getPphone());
			employeeDto.setTaddress(employee.getTaddress());
			employeeDto.setTphone(employee.getTphone());
			employeeDto.setType(employee.getType());
			employeeDto.setConsigno(employee.getConsigno());
			employeeDto.setConexpon(employee.getConexpon());
			employeeDto.setService(employee.getService());
			employeeDto.setWkcphone(employee.getWkcphone());
			employeeDto.setEmptype(employee.getEmptype());
			employeeDto.setPassword(employee.getPassword());
			employeeDto.setPhoto(employee.getPhoto());
			employeeDto.setCatg(employee.getCatg());
			employeeDto.setStart_sal(employee.getStart_sal());
			employeeDto.setBoard_type(employee.getBoard_type());
			employeeDto.setUpdate_on(employee.getUpdate_on());
			employeeDto.setDot(employee.getDot());
			employeeDto.setEmpid_new(employee.getEmpid_new());
			employeeDto.setMobile(employee.getMobile());
			employeeDto.setVerified(employee.getVerified());
			employeeDto.setPunch(employee.getPunch());
			employeeDtoList.add(employeeDto);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		return employeeDtoList;
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
