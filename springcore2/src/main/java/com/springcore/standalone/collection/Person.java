package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String,Integer> feeStructure;
    private Properties properties;

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feeStructure=" + feeStructure +
                ", properties=" + properties +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public Person setProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public Person setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
        return this;
    }

    public List<String> getFriends() {
        return friends;
    }

    public Person setFriends(List<String> friends) {
        this.friends = friends;
        return this;
    }
}
