package com.springdemo.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"com/springdemo/springcore/list/config.xml");

	// get the hospital bean from the container
	hospital Hospital = (hospital) context.getBean("Hospital");

	// print the bean
	System.out.println(Hospital);

}
}
