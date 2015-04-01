package com.technoidentity.service;

import net.sf.jasperreports.engine.JRDataSource;

public interface PdSanctionReportService {
	public JRDataSource getPdSanctionId(String id);
	public JRDataSource getDataSource();
}
