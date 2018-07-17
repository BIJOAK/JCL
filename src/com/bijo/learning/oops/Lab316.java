package com.bijo.learning.oops;

public class Lab316 {
    public static void main(String[] args) {
        Hello316 h=new Hello316();
//        h.m1();
    }
}
class Hello316{
    void m1(int... arr){
        System.out.println("m1(int...)");
    }
    void m1(String... arr){
        System.out.println("m1(String...)");
    }
}
