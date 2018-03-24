package com.shsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.demo.HelloService;

public class Test {

	public static void main(String[] args) {
		
		//加载spring配置文件
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-context.xml");
		
		//根据id获得bean
		HelloService hs = (HelloService)act.getBean("helloService");
		
		hs.print();
		
	}
}
