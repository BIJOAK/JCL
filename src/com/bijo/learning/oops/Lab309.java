package com.bijo.learning.oops;

public class Lab309 {
    public static void main(String[] args) {
        Hai309 hai=new Hai309();
        hai.a=99;
        Hello309 h=new Hello309();
        System.out.println("main begins: "+hai.a);
        h.m1(hai);
        System.out.println("main ends: "+hai.a);
    }
}
class Hello309{
    void m1(Hai309 hai){
        System.out.println("m1 begins: "+hai.a);
        hai=new Hai309();
        hai.a=hai.a+10;
        System.out.println("m1 ends: "+hai.a);
    }
}
class Hai309{
    int a;
}