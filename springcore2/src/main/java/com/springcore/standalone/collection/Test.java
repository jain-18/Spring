package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone_collection.xml");
        Person p1 = (Person) context.getBean("person1");
        System.out.println(p1);
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println(p1.getFeeStructure());
        System.out.println(p1.getFeeStructure().getClass().getName());
    }
}
