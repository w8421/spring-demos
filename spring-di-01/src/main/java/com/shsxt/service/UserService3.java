package com.shsxt.service;

import com.shsxt.dao.UserDao;

/**
 * 静态工厂注入
 * @author shun
 *
 */
public class UserService3 {

	private UserDao userDao;
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public void print() {
		System.out.println(userDao);
		System.out.println("Service33333");

	}
	
}
