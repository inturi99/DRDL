package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.Employee;
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
	public List<ProjectManager> validateLoginEmployee(String name, String password) {
		return sessionFactory
				.getCurrentSession()
				.createQuery(
						"from ProjectManager where name=:name and password=:password")
				.setString("name", name).setString("password",
						password).list();
	}

	@Override
	public List<ProjectManager> getEmployeeByEmployee(String name) {
		return sessionFactory.getCurrentSession().createQuery(
				"from ProjectManager where name=:name").setParameter(
				"name", name).list();
	}

		
}
