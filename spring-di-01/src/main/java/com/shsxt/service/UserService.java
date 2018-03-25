package com.shsxt.service;

import com.shsxt.dao.UserDao;

public class UserService {

	private UserDao userDao;
	
	private String name;
	
	private Integer age;
	
	public void setAge(Integer age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void print() {
		System.out.println(userDao);
		System.out.println(name+" ------!");
		System.out.println("age---" +age);
	}
	
}
