package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation_autowire.xml");
//        Emp e1 = (Emp) context.getBean("emp1");
        Emp e1 = context.getBean("emp1", Emp.class);
        System.out.println(e1);
    }
}
