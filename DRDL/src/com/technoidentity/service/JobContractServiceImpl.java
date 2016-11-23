package com.technoidentity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.EmployeeDao;
import com.technoidentity.dao.JobContractDao;
import com.technoidentity.dao.ProjectManagerDao;
import com.technoidentity.dto.JobContractDto;
import com.technoidentity.model.Employee;
import com.technoidentity.model.JobContract;
import com.technoidentity.model.ProjectManager;
@Service
public class JobContractServiceImpl implements JobContractService {
     @Autowired
    private JobContractDao jobContractDao;
     @Autowired
 	private EmployeeDao employeeDao;
     @Autowired
     private ProjectManagerDao projectManagerDao;

	@Override
	@Transactional
	public void addJobContract(JobContractDto jobContractDto) {
		Employee employee=employeeDao.getEmployeeId(new Integer(jobContractDto.getEmployeeId()));     
		ProjectManager projectManager=projectManagerDao.getProjectManagerId(new Integer(jobContractDto.getProjectManagerId()));     
		JobContract jobContract=new JobContract();
		jobContract.setEmployee(employee);
		jobContract.setProjectManager(projectManager);
		jobContract.setJcpropcd(jobContractDto.getJcpropcd());
		jobContract.setJob(jobContractDto.getJob());
		jobContract.setAmt(jobContractDto.getAmt());
		jobContract.setPaymode(jobContractDto.getPaymode());
		jobContract.setJcdate(jobContractDto.getJcdate());
		jobContract.setPdate(jobContractDto.getPdate());
		jobContract.setReceipt(jobContractDto.getReceipt());
		jobContract.setAuthorization(jobContractDto.getAuthorization());
		jobContractDao.addJobContract(jobContract);
	}

	@Override
	@Transactional
	public void updateJobContract(JobContractDto jobContractDto) {
		Employee employee=employeeDao.getEmployeeId(new Integer(jobContractDto.getEmployeeId()));     
		ProjectManager projectManager=projectManagerDao.getProjectManagerId(new Integer(jobContractDto.getProjectManagerId()));     
		JobContract jobContract=jobContractDao.getJobContractId(new Integer(jobContractDto.getId()));
		jobContract.setEmployee(employee);
		jobContract.setProjectManager(projectManager);
		jobContract.setJcpropcd(jobContractDto.getJcpropcd());
		jobContract.setJob(jobContractDto.getJob());
		jobContract.setAmt(jobContractDto.getAmt());
		jobContract.setPaymode(jobContractDto.getPaymode());
		jobContract.setJcdate(jobContractDto.getJcdate());
		jobContract.setPdate(jobContractDto.getPdate());
		jobContract.setReceipt(jobContractDto.getReceipt());
		jobContract.setAuthorization(jobContractDto.getAuthorization());
		jobContractDao.updateJobContract(jobContract);
		
	}

	@Override
	@Transactional
	public JobContractDto getJobContractId(String id) {
		JobContractDto jobContractDto=new JobContractDto();
		try{
			JobContract jobContract=jobContractDao.getJobContractId(new Integer(id));
			jobContractDto.setId(jobContract.getId().toString());
			jobContractDto.setEmployeeId(jobContract.getEmployee().getId().toString());
			jobContractDto.setProjectManagerId(jobContract.getProjectManager().getId().toString());
			jobContractDto.setJcpropcd(jobContract.getJcpropcd());
			jobContractDto.setJob(jobContract.getJob());
			jobContractDto.setAmt(jobContract.getAmt());
			jobContractDto.setPaymode(jobContract.getPaymode());
			jobContractDto.setJcdate(jobContract.getJcdate());
			jobContractDto.setPdate(jobContract.getPdate());
			jobContractDto.setReceipt(jobContract.getReceipt());
			jobContractDto.setAuthorization(jobContract.getProjectManager().getName());
		}catch(Exception e){
			e.printStackTrace();
		}
		return jobContractDto;
	}

	@Override
	@Transactional
	public List<JobContractDto> listJobContracts() {
		List<JobContractDto> jobContractDtoList=new ArrayList<JobContractDto>();
			List<JobContract> jobContractList=jobContractDao.listJobContracts();
			for(JobContract jobContract : jobContractList){
				JobContractDto jobContractDto=new JobContractDto();
				jobContractDto.setId(jobContract.getId().toString());
				jobContractDto.setEmployeeId(jobContract.getEmployee().getId().toString());
				jobContractDto.setProjectManagerId(jobContract.getProjectManager().getId().toString());
				jobContractDto.setJcpropcd(jobContract.getJcpropcd());
				jobContractDto.setJob(jobContract.getJob());
				jobContractDto.setAmt(jobContract.getAmt());
				jobContractDto.setPaymode(jobContract.getPaymode());
				jobContractDto.setJcdate(jobContract.getJcdate());
				jobContractDto.setPdate(jobContract.getPdate());
				jobContractDto.setReceipt(jobContract.getReceipt());
				jobContractDto.setAuthorization(jobContract.getAuthorization());
				jobContractDtoList.add(jobContractDto);
			}
		return jobContractDtoList;
	}

	@Override
	@Transactional
	public void removeJobContractEmloyee(Integer id) {
		jobContractDao.removeJobContractEmploye(id);
		
	}
	

}
