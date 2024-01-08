package com.springcore.javaconfig;


import org.springframework.stereotype.Component;


public class Student {
    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public Student setSamosa(Samosa samosa) {
        this.samosa = samosa;
        return this;
    }

    private Samosa samosa;
    public void study(){
        samosa.display();
        System.out.println("student is reading book");
    }
}
