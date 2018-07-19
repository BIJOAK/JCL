package com.bijo.learning.methodoverriding;

public class Lab378 {
    public static void main(String[] args) {
        Hai378 h=new Hai378();
        h.m1();
    }
}

class Hello378{
    A378 m1(){
        System.out.println("Hello-->m1()");
        return new A378();
    }
}
class Hai378 extends Hello378{
    A378 m1(){
        System.out.println("Hai-->m1()");
        return new A378();
    }
}

class A378{}
class B378 extends A378{}
