package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.User;
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
	}


	@Override
	public List<User> validateLoginUser(String name, String password) {
		return sessionFactory
				.getCurrentSession()
				.createQuery(
						"from User where name=:name and password=:password")
				.setString("name", name).setString("password",
						password).list();
	}

	@Override
	public List<User> getUserByUser(String name) {
		return sessionFactory.getCurrentSession().createQuery(
				"from User where name=:name").setParameter(
				"name", name).list();
	}

		
}
