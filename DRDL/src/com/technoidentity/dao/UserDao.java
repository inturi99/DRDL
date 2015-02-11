package com.technoidentity.dao;

import java.util.List;


import com.technoidentity.model.User;



public interface UserDao {
	public void addUser(User user);

	public List<User> validateLoginUser(String name, String password);
	public List<User> getUserByUser(String name);
}
