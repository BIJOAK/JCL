package com.bijo.learning.interfaces;

public class Lab417 {
    public static void main(String[] args) {
        Hello417 h=new Hello417();
        h.m1();
        h.m2();
        h.m3();
    }
}

class Hello417 implements Inter1,Inter2{
    public void m1(){
        System.out.println("Hello-->m1()");
    }
    public void m2(){
        System.out.println("Hello-->m2()");
    }
    public void m3(){
        System.out.println("Hello-->m3()");
        System.out.println(B);
        System.out.println(C);
    }
}