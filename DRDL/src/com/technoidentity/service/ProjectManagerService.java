package com.technoidentity.service;

import java.util.List;

import com.technoidentity.dto.ProjectManagerDto;
import com.technoidentity.model.ProjectManager;

public interface ProjectManagerService {
	public void addProjectManager(ProjectManagerDto projectManagerDto);

	public void updateProjectManager(ProjectManagerDto projectManagerDto);

	public ProjectManager getProjectManagerId(Integer id);

	public List<ProjectManager> listProjectManagers();

	public void removeProjectManager(Integer id);
}
