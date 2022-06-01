package com.bibekdhungana.collectionconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
		
		

	}

}
