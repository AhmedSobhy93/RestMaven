package com.ist.rest.user;

import java.util.HashMap;
import java.util.Map;

public enum UserDao {

	instance;
	
	private Map<String,User> users=new HashMap<String,User>();
	
	private UserDao() {
		User user1=new User("1","ahmed","Minofia");
		users.put("1", user1);
		User user2=new User("2","mohamed","Cairo");
		users.put("2", user2);
	}
	
	public Map<String,User> getUsers(){
		return users;
	}
}
