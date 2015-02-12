package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.ProjectManager;



public interface ProjectManagerDao {
	public void addProjectManager(ProjectManager projectManager);
	 public void updateProjectManager(ProjectManager projectManager);
	    public ProjectManager getProjectManagerId(Integer id);
	    public List<ProjectManager> listProjectManagers();
	    public void removeProjectManager(Integer id);
}
