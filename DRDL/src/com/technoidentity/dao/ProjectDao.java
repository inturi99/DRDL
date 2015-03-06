package com.technoidentity.dao;

import java.util.List;

import com.technoidentity.model.Project;

public interface ProjectDao {
	public void addProject(Project project);
	 public void updateProject(Project project);
	    public Project getProjectId(Integer id);
	    public List<Project> listProject();
	    public void removeProject(Integer id);
}
