package com.bijo.learning.oops;

public class Lab307 {
    public static void main(String[] args) {
        int a=99;
        Hello307 h =new Hello307();
        System.out.println("main begins: "+a);
        h.m1(a);
        System.out.println("main ends: "+a);

    }
}

class Hello307{
    void m1(int a){
        System.out.println("m1 begins: "+a);
        a=a+10;
        System.out.println("m1 ends: "+a);
    }
}
