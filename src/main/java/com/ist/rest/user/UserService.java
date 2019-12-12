package com.ist.rest.user;

import java.util.Map;

public class UserService {

	UserDao userDao;

	public UserService() {
		userDao = UserDao.instance;
	}

	public void addUser(User user) {
		userDao.getUsers().put(user.getId(), user);
	}

	public void deleteUser(String id) {
		userDao.getUsers().remove(id);
	}

	public User getUser(String id) {
		return userDao.getUsers().get(id);
	}

	public Map<String, User> getUsers() {
		return userDao.getUsers();
	}
}
