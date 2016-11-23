package com.technoidentity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.MonthlyWorkingDaysDao;
import com.technoidentity.dto.MonthlyWorkingDaysDto;
import com.technoidentity.model.MonthlyWorkingDays;

@Service
public class MonthlyWorkingDaysServiceImpl implements MonthlyWorkingDaysService {
	@Autowired
	public MonthlyWorkingDaysDao monthlyWorkingDaysDao;
	@Override
	@Transactional
	public void saveMonthlyworkingdays(MonthlyWorkingDaysDto monthlyWorkingDaysDto)
	    {
		try {
			MonthlyWorkingDays monthlyWorkingDays=new MonthlyWorkingDays();
			monthlyWorkingDays.setMonth(monthlyWorkingDaysDto.getMonth());
			monthlyWorkingDays.setDays(monthlyWorkingDaysDto.getWorkingdays());
			monthlyWorkingDays.setYear(monthlyWorkingDaysDto.getYear());
			monthlyWorkingDaysDao.saveMonthyWorkingDays(monthlyWorkingDays);
                 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

