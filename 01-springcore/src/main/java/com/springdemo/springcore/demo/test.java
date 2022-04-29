package com.springdemo.springcore.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.springcore.reftypes.Student;

public class test {
	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemo/springcore/demo/config.xml");

		// get the hospital bean from the container
		Shoping shop = (Shoping) context.getBean("shop");
		
		// print the bean
		System.out.println(shop);
}
}
