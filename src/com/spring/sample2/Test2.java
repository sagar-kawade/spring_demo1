package com.spring.sample2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	
	public static void main(String[] args) {
		BeanFactory factory =new ClassPathXmlApplicationContext("Beans1.xml");
		College c1=(College)factory.getBean("college");
		System.out.println(c1.getCollege_name());
		
	}

}
