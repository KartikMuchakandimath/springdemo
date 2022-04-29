package com.springdemo.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.springcore.list.hospital;

public class test {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemo/springcore/map/config.xml");

		// get the hospital bean from the container
		Customer customer = (Customer) context.getBean("customer");

		// print the bean
		System.out.println(customer);

	}

}
