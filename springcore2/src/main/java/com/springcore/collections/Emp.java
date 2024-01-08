package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String,String> course;

    public String getName() {
        return name;
    }

    public Emp setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getPhones() {
        return phones;
    }

    public Emp setPhones(List<String> phones) {
        this.phones = phones;
        return this;
    }

    public Set<String> getAddress() {
        return address;
    }

    public Emp setAddress(Set<String> address) {
        this.address = address;
        return this;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public Emp setCourse(Map<String, String> course) {
        this.course = course;
        return this;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                ", course=" + course +
                '}';
    }

    public Emp(String name, List<String> phones, Set<String> address, Map<String, String> course) {
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.course = course;
    }

    public Emp(){
    }
}
