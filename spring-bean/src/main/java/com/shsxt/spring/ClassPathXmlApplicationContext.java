package com.shsxt.spring;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

/**
 * 加载配置文件 并提供bean
 * @author shun
 *
 */
public class ClassPathXmlApplicationContext implements ApplicationContext{

	//配置文件的地址
	private String filePath;
	
	//bean的缓存池 
	private Map<String, Object> map = new HashMap<String, Object>();
	 
	//构造方法
	public ClassPathXmlApplicationContext(String filePath) {

		this.filePath = filePath;
	}

	public Object getBean(String name) {
		
		return map.get(name);
	}
	
	/**
	 * 解析XML
	 * @param path
	 */
	public void xmlContextReader(String path) {
		
		//创建saxReader
		SAXReader sax = new SAXReader();
		
		//创建document
		try {
			sax.read(new File(""));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
