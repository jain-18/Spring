package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
@Component("ob")
@Scope("prototype")
public class Student {
    @Value("shubham sohanlal jain")
    private String studentName;
    @Value("Mumbai")
    private String City;

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", City='" + City + '\'' +
                ", address=" + address +
                '}';
    }

    public List<String> getAddress() {
        return address;
    }

    public Student setAddress(List<String> address) {
        this.address = address;
        return this;
    }

    @Value("#{temp}")
    private List<String> address;

    public String getStudentName() {
        return studentName;
    }

    public Student setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public String getCity() {
        return City;
    }

    public Student setCity(String city) {
        City = city;
        return this;
    }
}
