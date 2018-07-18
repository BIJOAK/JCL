package com.bijo.learning.inheritance;

public class Lab326n327 {
    public static void main(String[] args) {
        Hello326 hello =new Hello326();
        hello.m1();
        hello.m2();

    }
}
class Hai326{
    int a=99;
    void m1(){
        System.out.println("Hai-->m1():"+a);
//        System.out.println("Hai-->m1():"+b);
    }
}
class Hello326 extends Hai326{
    int b=88;
    void m2(){
        System.out.println("Hello-->m2(): "+a);
        System.out.println("Hello-->m2(): "+b);
    }
}
