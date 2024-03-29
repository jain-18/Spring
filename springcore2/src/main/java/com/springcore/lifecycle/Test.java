package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        instead of application context we have used AbstractApplicationContext which know there may destroy method present
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
//        Samosa ss = (Samosa) context.getBean("s1");
//        System.out.println(ss);
//        registering shutdown hook
        context.registerShutdownHook();
//
//
//        System.out.println("+++++++++++++++++++++++++++++");
//        Pepsi p1 = (Pepsi) context.getBean("p1");
//        System.out.println(p1);
//        context.registerShutdownHook();

        Example e1 = (Example) context.getBean("example");
        System.out.println(e1);
    }
}
