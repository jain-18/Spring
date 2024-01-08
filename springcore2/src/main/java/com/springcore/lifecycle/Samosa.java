package com.springcore.lifecycle;

public class Samosa {

    /**
     * lifecycle configuration using xml
     */
    private double price;

    public double getPrice() {
        return price;
    }

    public Samosa setPrice(double price) {
        System.out.println("Setting property");
        this.price = price;
        return this;
    }

    public Samosa() {

    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("inside destroy method");
    }

}
