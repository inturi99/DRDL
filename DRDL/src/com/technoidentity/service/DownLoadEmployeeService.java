package com.technoidentity.service;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sun.misc.BASE64Encoder;

import com.technoidentity.dao.EmployeeDao;
import com.technoidentity.dto.EmployeeDto;
import com.technoidentity.model.Employee;
@Service
public class DownLoadEmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	List<EmployeeDto> employeeDtoList ;
	@Transactional
	public JRDataSource getEmployeeId(String id) {
		employeeDtoList = new ArrayList<EmployeeDto>();
		EmployeeDto employeeDto = new EmployeeDto();
		try {
			Employee employee = employeeDao.getEmployeeId(new Integer(id));
			employeeDto.setId(employee.getId().toString());
			String empId=employee.getId().toString();
			String empName=employee.getName().substring(0, 3).toUpperCase();
			String empNo=empName +" - "+ empId;
			employeeDto.setEmployeeNumber(empNo);
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

			byte[] photoBytes = employee.getPhoto();
			BASE64Encoder bn = new BASE64Encoder();
			String photoInString = bn.encodeBuffer(photoBytes);
			employeeDto.setPhoto(photoInString);

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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new JRBeanCollectionDataSource(employeeDtoList);

	}
    @Transactional
	public JRDataSource getDataSource() {
    	employeeDtoList = new ArrayList<EmployeeDto>();
		try {
			List<Employee> employeeList = employeeDao.listEmployees();
			for (Employee employee : employeeList) {
				EmployeeDto employeeDto = new EmployeeDto();
				employeeDto.setId(employee.getId().toString());
				String empId=employee.getId().toString();
				String empName=employee.getName().substring(0, 3).toUpperCase();
				String empNo=empName +" - "+ empId;
				employeeDto.setEmployeeNumber(empNo);
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

				byte[] photoBytes = employee.getPhoto();
				BASE64Encoder bn = new BASE64Encoder();
				String photoInString = bn.encodeBuffer(photoBytes);
				employeeDto.setPhoto(photoInString);

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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new JRBeanCollectionDataSource(employeeDtoList);
	}
}
