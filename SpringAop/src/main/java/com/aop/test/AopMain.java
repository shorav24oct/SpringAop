package com.aop.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		ShapeService shapeService = applicationContext.getBean("shapeService", ShapeService.class);
		
		System.out.println(shapeService.getCircle().getName());
		
		applicationContext.close();
	}

}
