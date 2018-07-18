package com.bijo.learning.inheritance;

public class Lab323 {
    public static void main(String[] args) {
        Hai323 hai=new Hai323();
        System.out.println(hai.a);
//        System.out.println(hai.b);

        Hello323 hello=new Hello323();
//        System.out.println(hello.a);
        System.out.println(hello.b);
    }
}
class Hai323{
    int a=99;
}
class Hello323{
    int b=88;
}