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
	public void updateProjectManager(ProjectManager projectManager) {
		// TODO Auto-generated method stub
		projectManagerDao.updateProjectManager(projectManager);
	}
	@Transactional
	public ProjectManager getProjectManagerId(Integer id) {
		// TODO Auto-generated method stub
		return projectManagerDao.getProjectManagerId(id);
	}
	@Transactional
	public List<ProjectManager> listProjectManagers() {
		// TODO Auto-generated method stub
		return projectManagerDao.listProjectManagers();
	}
	@Transactional
	public void removeProjectManager(Integer id) {
		// TODO Auto-generated method stub
		projectManagerDao.removeProjectManager(id);
	}
	

	

}
