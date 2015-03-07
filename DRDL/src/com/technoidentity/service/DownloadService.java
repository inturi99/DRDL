package com.technoidentity.service;

import net.sf.jasperreports.engine.JRDataSource;

import com.technoidentity.dto.EmployeeDto;

public interface DownloadService {
	public EmployeeDto getEmployeeId(String id);
	public JRDataSource getDataSource();
}
