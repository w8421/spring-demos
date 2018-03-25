package com.shsxt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.bean.UserService2;

public class App {

	public static void main(String[] args) {
		
		// 加载好配置文件夹
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-context.xml");

//		UserService userService = act.getBean(UserService.class);
//		
//		userService.print();
//		
		UserService2 bean = act.getBean(UserService2.class);
		
		bean.print();
	}
}
