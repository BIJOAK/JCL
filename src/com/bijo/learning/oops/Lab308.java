package com.bijo.learning.oops;

public class Lab308 {
    public static void main(String[] args) {
        Hai308 hai=new Hai308();
        hai.a=99;
        Hello308 h=new Hello308();
        System.out.println("main begins: "+hai.a);
        h.m1(hai);
        System.out.println("main ends: "+hai.a);
    }
}
class Hello308{
    void m1(Hai308 hai){
        System.out.println("m1 begins: "+hai.a);
        hai.a=hai.a+10;
        System.out.println("m1 ends: "+hai.a);
    }
}
class Hai308{
    int a;
}