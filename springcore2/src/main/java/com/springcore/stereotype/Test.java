package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereoconfig.xml");
//        Student student = (Student) context.getBean("student");
        Student student = (Student) context.getBean("ob");
//        System.out.println(student);
//        System.out.println(student.getAddress().getClass().getName());
//        System.out.println(student.hashCode());
        Student s2 = (Student) context.getBean("ob");
//        System.out.println(s2.hashCode());

        Teacher t1 = (Teacher) context.getBean("teacher");
        Teacher t2 = (Teacher) context.getBean("teacher");

        System.out.println(t1.hashCode()+"\n"+t2.hashCode());
    }
}
