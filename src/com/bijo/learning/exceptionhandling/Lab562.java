package com.bijo.learning.exceptionhandling;

public class Lab562 {
    public static void main(String[] args) {
        System.out.println("main started");

        try {
            new Hello562().show();
        } catch (Exception e) {
            System.out.println("\ncatch block");
            System.out.println("Ex: "+e);
            System.out.println("Message :"+e.getMessage());
            System.out.println("Cause: "+e.getCause());
            System.out.println();
            e.printStackTrace();
        }
        System.out.println("main completed");
    }

}

class Hello562{
    void show(){
        System.out.println("show() begins");
        new A562().m1();
        System.out.println("show() ends");
    }
}
class A562{
    void m1(){
        System.out.println("A-->m1() begin");
        new B562().m2();
        System.out.println("A-->m1() ends");
    }
}
class B562{
    void m2(){
        System.out.println("B-->m2() begins");
        new C562().m3();
        System.out.println("B-->m2() ends");
    }
}

class C562{
    void m3(){
        System.out.println("C-->m3() begins");
        int x=10/0;
        System.out.println("C-->m3() ends");
    }
}