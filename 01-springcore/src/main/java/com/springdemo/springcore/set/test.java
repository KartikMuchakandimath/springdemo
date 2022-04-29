package com.springdemo.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemo/springcore/set/config.xml");
	CarDealer Car = (CarDealer) context.getBean("Car");
	System.out.println(Car);
	System.out.println(Car.getName().getClass());
	
}
}
