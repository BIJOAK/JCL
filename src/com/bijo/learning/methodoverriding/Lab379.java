package com.bijo.learning.methodoverriding;

public class Lab379 {
    public static void main(String[] args) {
        Hai378 h=new Hai378();
        h.m1();
    }
}

class Hello379{
    A379 m1(){
        System.out.println("Hello-->m1()");
        return new A379();
    }
}
class Hai379 extends Hello379{
    A379 m1(){
        System.out.println("Hai-->m1()");
        return new B379();
    }
}

class A379{}
class B379 extends A379{}