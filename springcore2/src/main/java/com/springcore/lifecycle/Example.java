package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

/**
 * lifecycle configuration using annotations
 */
    private String subject;

    public String getSubject() {
        return subject;
    }

    public Example setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public Example() {
    }
    @PostConstruct
    public void start(){
        System.out.println("Starting method");
    }
    @PreDestroy
    public void end(){
        System.out.println("Ending method");
    }
}
