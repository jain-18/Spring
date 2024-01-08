package com.springcore.ref;

public class A {
    private int x;
    private B ob;

    public int getX() {
        return x;
    }

    public A setX(int x) {
        this.x = x;
        return this;
    }

    public B getOb() {
        return ob;
    }

    public A setOb(B ob) {
        this.ob = ob;
        return this;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }

    public A(int x, B ob) {
        this.x = x;
        this.ob = ob;
    }
    public A(){

    }
}
