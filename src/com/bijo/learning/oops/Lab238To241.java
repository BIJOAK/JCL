package com.bijo.learning.oops;

public class Lab238To241 {
    public static void main(String as[]){
        int a;
        a=10;
        System.out.println(a);
        Hello2 h1=new Hello2();
        System.out.println("Main: "+h1.a);
        System.out.println("Main: "+h1.c);
    }
}

class Hello2{
    int a;
//    a=10;  //not allowed as a java statement, it should be in a block or method or constructor or at the same line as it declared
    static int b;
//    b=10;//not allowed as a java statement, it should be in a block or method or constructor or at the same line as it declared
    int c;
    {
        c=20;
        System.out.println("Initialized: "+c);
    }
}