package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.JobContractDto;

public interface JobContractService {
	 public void addJobContract(JobContractDto jobContractDto);
	 public void updateJobContract(JobContractDto jobContractDto);
	    public JobContractDto getJobContractId(Integer id);
	    public List<JobContractDto> listJobContracts();
}
