package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.Employee;
import com.technoidentity.model.ProjectManager;



public interface ProjectManagerDao {
	public void addProjectManager(ProjectManager projectManager);

	public List<ProjectManager> validateLoginEmployee(String name, String password);
	public List<ProjectManager> getEmployeeByEmployee(String name);
}
