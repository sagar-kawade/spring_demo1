package com.spring.sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Prototype.xml");
		Abc a1=(Abc)context.getBean("Demo");

		a1.setCloth_code(1900);
		a1.setCloth_type("silk");
		System.out.println(a1.getCloth_code());
		System.out.println(a1.getCloth_type());
		Abc a2=(Abc)context.getBean("Demo");

		a2.setCloth_code(2000);
		a2.setCloth_type("nylon");
		System.out.println(a2.getCloth_code());
		System.out.println(a2.getCloth_type());

	}

}
