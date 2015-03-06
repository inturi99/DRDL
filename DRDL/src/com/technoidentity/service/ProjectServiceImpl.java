package com.technoidentity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.ProjectDao;
import com.technoidentity.dto.ProjectDto;
import com.technoidentity.model.Project;
@Service
public class ProjectServiceImpl implements ProjectService{
  @Autowired
  private ProjectDao projectDao;
	@Transactional
	public void addProject(ProjectDto projectDto) {
		Project project=new Project();
		project.setProjectCode(projectDto.getProjectCode());
		project.setProjectName(projectDto.getProjectName());
		project.setProjectDirector(projectDto.getProjectDirector());
		projectDao.addProject(project);
	}

	@Transactional
	public void updateProject(ProjectDto projectDto) {
		Project project=projectDao.getProjectId(new Integer(projectDto.getProjectId()));
		project.setProjectCode(projectDto.getProjectCode());
		project.setProjectName(projectDto.getProjectName());
		project.setProjectDirector(projectDto.getProjectDirector());
		projectDao.updateProject(project);
	}

	@Transactional
	public ProjectDto getProjectId(String id) {
		Project project=projectDao.getProjectId(new Integer(id));
		ProjectDto projectDto=new ProjectDto();
		projectDto.setProjectId(project.getId().toString());
		projectDto.setProjectCode(project.getProjectCode());
		projectDto.setProjectName(project.getProjectName());
		projectDto.setProjectDirector(project.getProjectDirector());
		return projectDto;
	}

	@Transactional
	public List<ProjectDto> listProject() {
		List<ProjectDto> projectDtoList=new ArrayList<ProjectDto>();
		try{
			List<Project> projectList=projectDao.listProject();
			for(Project project : projectList){
				ProjectDto projectDto=new ProjectDto();
				projectDto.setProjectId(project.getId().toString());
				projectDto.setProjectCode(project.getProjectCode());
				projectDto.setProjectName(project.getProjectName());
				projectDto.setProjectDirector(project.getProjectDirector());
				projectDtoList.add(projectDto);
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return projectDtoList;
	}

	@Transactional
	public void removeProject(Integer id) {
		// TODO Auto-generated method stub
		projectDao.removeProject(id);
	}

}
