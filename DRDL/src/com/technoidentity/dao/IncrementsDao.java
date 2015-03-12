package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.Increments;

public interface IncrementsDao {
	public void addIncrement(Increments increments);
	 public List<Increments> findByEmployeeId(Integer employeeId);
	   
}
