package com.springcore.javaconfig;

import com.springcore.lifecycle.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
    @Bean
    public Student getStudent(){
        //creating new object
        Student student = new Student(new com.springcore.javaconfig.Samosa());
        return  student;
    }
}
