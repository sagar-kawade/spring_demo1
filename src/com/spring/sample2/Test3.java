package com.spring.sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("Beans2.xml");
		Lab l1= (Lab)container.getBean("Lab");
		l1.setBook_code(101);
		l1.setBook_name("java");
		Lab l2= (Lab)container.getBean("Lab");
		l2.setBook_code(201);
		l2.setBook_name("c lang");
		System.out.println(l2.getBook_code());
		System.out.println(l2.getBook_name());
		System.out.println(l1.getBook_code());
		System.out.println(l1.getBook_name());
		
	}

}
