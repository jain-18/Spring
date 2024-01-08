package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
/**
 * lifecycle configuration by implementing interfaces
 */
    private double price;

    public double getPrice() {
        return price;
    }

    public Pepsi setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }
    public Pepsi() {
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        init
        System.out.println("taking papesi : init");
    }

    @Override
    public void destroy() throws Exception {
        //destry
        System.out.println("throwing bottle to trash can");
    }
}
