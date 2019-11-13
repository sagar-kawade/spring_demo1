package com.spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.sample2.Abc;

public class Test1 {

	public static void main(String[] args) {
     
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/SAGAR KAWADE/eclipse-workspace/spring_demo1/src/Beans.xml");
		Student1 s1= (Student1)context.getBean("std_id");
		Teachers t1= (Teachers)context.getBean("Teacher_id");
		
		System.out.println(s1.getStudent_name());
		System.out.println(t1.getTeacher_name());
	}

}
