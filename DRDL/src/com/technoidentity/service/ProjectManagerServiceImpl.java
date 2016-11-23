package com.technoidentity.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.ProjectManagerDao;
import com.technoidentity.dto.ProjectManagerDto;
import com.technoidentity.model.ProjectManager;

@Service
public class ProjectManagerServiceImpl implements ProjectManagerService {
	@Autowired
	private ProjectManagerDao projectManagerDao;

	@Override
	@Transactional
	public void addProjectManager(ProjectManagerDto projectManagerDto) {
		// TODO Auto-generated method stub
		ProjectManager projectManager = new ProjectManager();
		projectManager.setPmcode(projectManagerDto.getPmcode());
		projectManager.setName(projectManagerDto.getName());
		projectManager.setEmail(projectManagerDto.getEmail());
		projectManager.setDesignation(projectManagerDto.getDesignation());
		projectManager.setGrade(projectManagerDto.getGrade());
		projectManager.setDob(projectManagerDto.getDob());
		projectManager.setPhoneNumber(projectManagerDto.getPhoneNumber());
		projectManagerDao.addProjectManager(projectManager);

	}

	@Override
	@Transactional
	public void updateProjectManager(ProjectManagerDto projectManagerDto) {
		// TODO Auto-generated method stub
		ProjectManager projectManager = projectManagerDao
				.getProjectManagerId(new Integer(projectManagerDto.getId()));
		projectManager.setPmcode(projectManagerDto.getPmcode());
		projectManager.setName(projectManagerDto.getName());
		projectManager.setEmail(projectManagerDto.getEmail());
		projectManager.setDesignation(projectManagerDto.getDesignation());
		projectManager.setGrade(projectManagerDto.getGrade());
		projectManager.setDob(projectManagerDto.getDob());
		projectManager.setPhoneNumber(projectManagerDto.getPhoneNumber());
		projectManagerDao.updateProjectManager(projectManager);
	}

	@Override
	@Transactional
	public ProjectManagerDto getProjectManagerId(String id) {
			ProjectManager projectManager=projectManagerDao.getProjectManagerId(new Integer(id));
				ProjectManagerDto projectManagerDto=new ProjectManagerDto();
				projectManagerDto.setId(projectManager.getId().toString());
				projectManagerDto.setPmcode(projectManager.getPmcode());
				projectManagerDto.setName(projectManager.getName());
				projectManagerDto.setEmail(projectManager.getEmail());
				projectManagerDto.setDesignation(projectManager.getDesignation());
				projectManagerDto.setGrade(projectManager.getGrade());
				projectManagerDto.setDob(projectManager.getDob());
				projectManagerDto.setPhoneNumber(projectManager.getPhoneNumber());
				
		return projectManagerDto;
	}

	@Override
	@Transactional
	public List<ProjectManagerDto> listProjectManagers() {
		List<ProjectManagerDto> projectManagerDtoList=new ArrayList<ProjectManagerDto>();
		try{
			List<ProjectManager> projectManagerList=projectManagerDao.listProjectManagers();
			for(ProjectManager projectManager : projectManagerList){
				ProjectManagerDto projectManagerDto=new ProjectManagerDto();
				projectManagerDto.setId(projectManager.getId().toString());
				projectManagerDto.setPmcode(projectManager.getPmcode());
				projectManagerDto.setName(projectManager.getName());
				projectManagerDto.setEmail(projectManager.getEmail());
				projectManagerDto.setDesignation(projectManager.getDesignation());
				projectManagerDto.setGrade(projectManager.getGrade());
				projectManagerDto.setDob(projectManager.getDob());
				projectManagerDto.setPhoneNumber(projectManager.getPhoneNumber());
				projectManagerDtoList.add(projectManagerDto);
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return projectManagerDtoList;
	}

	@Override
	@Transactional
	public void removeProjectManager(Integer id) {
		// TODO Auto-generated method stub
		projectManagerDao.removeProjectManager(id);
	}

}
