package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{10*34}")
    private int x;
    @Value("#{20-89+63*54}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double z;

    @Value("#{T(java.lang.Math).E}")
    private double e;

    @Value("#{new java.lang.String('Shubham_jain')}")
    private String name;

    @Value("#{ 8>3 }")
    private boolean isActive;

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public boolean isActive() {
        return isActive;
    }

    public Demo setActive(boolean active) {
        isActive = active;
        return this;
    }

    public String getName() {
        return name;
    }

    public Demo setName(String name) {
        this.name = name;
        return this;
    }





    public double getE() {
        return e;
    }

    public Demo setE(double e) {
        this.e = e;
        return this;
    }

    public double getZ() {
        return z;
    }

    public Demo setZ(double z) {
        this.z = z;
        return this;
    }


    public int getY() {
        return y;
    }

    public Demo setY(int y) {
        this.y = y;
        return this;
    }

    public int getX() {
        return x;
    }

    public Demo setX(int x) {
        this.x = x;
        return this;
    }

}
