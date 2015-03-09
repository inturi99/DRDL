package com.technoidentity.service;

import net.sf.jasperreports.engine.JRDataSource;

public interface JasperReportService {
	public JRDataSource getEmployeeId(String id);
	public JRDataSource getDataSource();
}
