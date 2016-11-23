package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.ProjectManagerDto;

public interface ProjectManagerService {
	public void addProjectManager(ProjectManagerDto projectManagerDto);

	public void updateProjectManager(ProjectManagerDto projectManagerDto);

	public ProjectManagerDto getProjectManagerId(String id);

	public List<ProjectManagerDto> listProjectManagers();

	public void removeProjectManager(Integer id);
}
