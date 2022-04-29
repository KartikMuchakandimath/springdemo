package com.springdemo.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemo/springcore/reftypes/config.xml");

		// get the hospital bean from the container
		Student student = (Student) context.getBean("student");
		
		// print the bean
		System.out.println(student);
}
}