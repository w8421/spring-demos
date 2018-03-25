package com.shsxt.spring;

/**
 * bean 工厂
 * @author shun
 *
 */
public interface BeanFactory {

	/**
	 * 获取bean
	 * @param name
	 * @return
	 */
	public Object getBean(String name);
	
}
