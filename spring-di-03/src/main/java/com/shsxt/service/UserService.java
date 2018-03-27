package com.shsxt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.shsxt.dao.UserDao;

public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void print() {
		System.out.println(userDao);
	}
}
