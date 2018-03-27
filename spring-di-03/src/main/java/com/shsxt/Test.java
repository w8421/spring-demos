package com.shsxt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		//加载spring配置文件
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-context.xml");
		
//		UserService bean = act.getBean(UserService.class);
//		
//		bean.print();		
		
//		UserService2 bean2 = act.getBean(UserService2.class);
//		
//		bean2.print();	
		
				
	}
}
