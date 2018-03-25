package com.shsxt.service;

import com.shsxt.dao.UserDao;

/**
 * 静态工厂
 * @author shun
 *
 */
public class StaticFactory {

	public static UserDao createUserDao() {
		
		return new UserDao();
	}
}
