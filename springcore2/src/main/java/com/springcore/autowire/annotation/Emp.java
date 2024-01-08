package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("address123")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Emp setAddress(Address address) {
        System.out.println("setter");
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Emp {" +
                "address=" + address +
                '}';
    }

    public Emp(Address address) {
        System.out.println("inside constructor");
        this.address = address;
    }
}
