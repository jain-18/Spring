package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        A aref = (A) context.getBean("aref");
        B bref = (B) context.getBean("bref");
        System.out.println();
        System.out.println(aref);
        System.out.println();
        System.out.println(bref);
    }
}
