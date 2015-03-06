package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.Project;
@Repository
public class ProjectDaoImpl implements ProjectDao{
@Autowired
private SessionFactory sessionFactory;
	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(project);
	}

	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(project);
		
	}

	@Override
	public Project getProjectId(Integer id) {
		Project project=(Project)sessionFactory.getCurrentSession().load(Project.class, new Integer(id));
		return project;
	}

	@Override
	public List<Project> listProject() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Project").list();
	}

	@Override
	public void removeProject(Integer id) {
		// TODO Auto-generated method stub
		Project project=(Project)sessionFactory.getCurrentSession().load(Project.class, id);
		if(project !=null){
			sessionFactory.getCurrentSession().delete(project);
		}
	}

}
