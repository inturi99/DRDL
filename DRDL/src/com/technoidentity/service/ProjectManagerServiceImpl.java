package com.technoidentity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.ProjectManagerDao;
import com.technoidentity.model.ProjectManager;
@Service
public class ProjectManagerServiceImpl implements ProjectManagerService {
	@Autowired
	private ProjectManagerDao projectManagerDao;
	@Transactional
	public void addProjectManager(ProjectManager projectManager) {
		// TODO Auto-generated method stub
		projectManagerDao.addProjectManager(projectManager);
		
	}
	@Transactional
	public List<ProjectManager> validateLoginEmployee(String name, String password) {
		// TODO Auto-generated method stub
		return projectManagerDao.validateLoginEmployee(name, password);
	}

	@Transactional
	public List<ProjectManager> getEmployeeByEmployee(String name) {
		// TODO Auto-generated method stub
		return projectManagerDao.getEmployeeByEmployee(name);
	}

	

}
