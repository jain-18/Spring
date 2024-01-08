package com.springcore.ci;

public class Addition {
    private int a,b;
    public Addition(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("contructor : int, int");
    }
    public Addition(double a,double b){
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("contructor : double, doble");
    }
    public Addition(String a,String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("contructor : string, string");
    }

    public void doSum(){
        System.out.println("Sum is = "+(this.a+this.b));
    }


}
