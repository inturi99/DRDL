package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.ProjectDto;

public interface ProjectService {
	public void addProject(ProjectDto projectDto);
	 public void updateProject(ProjectDto projectDto);
	    public ProjectDto getProjectId(String id);
	    public List<ProjectDto> listProject();
	    public void removeProject(Integer id);
}
