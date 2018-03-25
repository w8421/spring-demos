package com.shsxt.factory;

import com.shsxt.bean.UserService2;

/**
 * 实例化工厂创建bean
 * @author shun
 *
 */
public class InstanceFactory {

	public UserService2 createUserService2() {
		return new UserService2();
	}
}
