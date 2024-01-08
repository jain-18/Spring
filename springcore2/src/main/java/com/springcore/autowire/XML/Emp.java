package com.springcore.autowire.XML;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Emp setAddress(Address address) {
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
        this.address = address;
    }
}
