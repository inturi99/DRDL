package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.ProjectManager;
@Repository
public class ProjectManagerDaoImpl implements ProjectManagerDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addProjectManager(ProjectManager projectManager) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(projectManager);
	}
	@Override
	public void updateProjectManager(ProjectManager projectManager) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(projectManager);
	}
	@Override
	public ProjectManager getProjectManagerId(Integer id) {
		// TODO Auto-generated method stub
		ProjectManager projectManager=(ProjectManager)sessionFactory.getCurrentSession().load(ProjectManager.class, new Integer(id));
		return projectManager;
	}
	@Override
	public List<ProjectManager> listProjectManagers() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from ProjectManager").list();
	}
	@Override
	public void removeProjectManager(Integer id) {
		// TODO Auto-generated method stub
		ProjectManager projectManager=(ProjectManager)sessionFactory.getCurrentSession().load(ProjectManager.class, id);
		if(projectManager !=null){
			sessionFactory.getCurrentSession().delete(projectManager);
		}
	}


	
		
}
