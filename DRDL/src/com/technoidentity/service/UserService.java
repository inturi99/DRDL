package com.technoidentity.service;

import java.util.List;

import com.technoidentity.model.User;



public interface UserService {
	public void addUser(User user);
	public List<User> validateLoginUser(String name, String password);
	public List<User> getUserByUser(String name);
}
