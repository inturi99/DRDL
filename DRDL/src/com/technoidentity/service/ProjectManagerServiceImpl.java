package com.technoidentity.service;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.technoidentity.dao.ProjectManagerDao;
import com.technoidentity.dto.ProjectManagerDto;
import com.technoidentity.model.ProjectManager;

@Service
public class ProjectManagerServiceImpl implements ProjectManagerService {
	@Autowired
	private ProjectManagerDao projectManagerDao;

	@Transactional
	public void addProjectManager(ProjectManagerDto projectManagerDto) {
		// TODO Auto-generated method stub
		ProjectManager projectManager = new ProjectManager();
		projectManager.setPmcode(projectManagerDto.getPmcode());
		projectManager.setName(projectManagerDto.getName());
		projectManager.setEmail(projectManagerDto.getEmail());
		projectManager.setDesignation(projectManagerDto.getDesignation());
		projectManager.setGrade(projectManagerDto.getGrade());
		Date dateofDob = projectManagerDto.getDob();
		System.out.println(dateofDob);
		projectManager.setDob(projectManagerDto.getDob());
		/*DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-dd-mm");
		try {
			Date date = dateFormat.parse(dateInString);
			System.out.println(dateFormat.format(date));
			String dd=dateFormat1.format(date);
			System.out.println(dd);
			Date date1 =dateFormat1.parse(dd);
			System.out.println(date1);
		   projectManager.setDob(date1);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ParseException e) {
			e.printStackTrace();
		}
*/		projectManager.setPhoneNumber(projectManagerDto.getPhoneNumber());
		projectManagerDao.addProjectManager(projectManager);

	}

	@Transactional
	public void updateProjectManager(ProjectManagerDto projectManagerDto) {
		// TODO Auto-generated method stub
		ProjectManager projectManager = projectManagerDao
				.getProjectManagerId(projectManagerDto.getId());
		projectManager.setPmcode(projectManagerDto.getPmcode());
		projectManager.setName(projectManagerDto.getName());
		projectManager.setEmail(projectManagerDto.getEmail());
		projectManager.setDesignation(projectManagerDto.getDesignation());
		projectManager.setGrade(projectManagerDto.getGrade());
		projectManager.setDob(projectManagerDto.getDob());
		projectManager.setPhoneNumber(projectManagerDto.getPhoneNumber());
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
