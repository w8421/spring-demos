package com.shsxt.factory;

import com.shsxt.bean.UserService;

/**
 * 静态工厂
 * @author shun
 *
 */
public class StaticFactory {
	
	public static UserService  createUserService() {
		
		return new UserService();
	}
}





