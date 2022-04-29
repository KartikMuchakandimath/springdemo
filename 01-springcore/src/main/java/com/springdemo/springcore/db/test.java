package com.springdemo.springcore.db;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
		
		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemo/springcore/db/config.xml");
		
		// get the employee bean from the container
		employe emp = (employe) context.getBean("emp");
		
		// print the bean
		//System.out.println(emp);
}

}