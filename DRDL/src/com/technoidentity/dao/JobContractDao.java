package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.JobContract;

public interface JobContractDao {
	 public void addJobContract(JobContract jobContract);
	 public void updateJobContract(JobContract jobContract);
	    public JobContract getJobContractId(Integer id);
	    public List<JobContract> listJobContracts();
	    public void removeJobContractEmploye(Integer id);
}
