package com.springcore.ref;

public class B {
    private int y;

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }

    public B setY(int y) {
        this.y = y;
        return this;
    }

    public B(int y) {
        this.y = y;
    }
    public B(){

    }
}
