package com.technoidentity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoidentity.dao.UserDao;
import com.technoidentity.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Transactional
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);;
		
	}
	@Transactional
	public List<User> validateLoginUser(String name, String password) {
		// TODO Auto-generated method stub
		return userDao.validateLoginUser(name, password);
	}

	@Transactional
	public List<User> getUserByUser(String name) {
		// TODO Auto-generated method stub
		return userDao.getUserByUser(name);
	}

	

}
