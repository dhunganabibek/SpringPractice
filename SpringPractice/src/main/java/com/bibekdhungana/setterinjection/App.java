package com.bibekdhungana.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Person person = context.getBean("person",Person.class);
        System.out.println(person);
        System.out.println("Done");
    }
}
