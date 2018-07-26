package com.bijo.learning.innerclass;

public class Lab437 {
    public static void main(String[] args) {
        System.out.println("Hello Guys");
    }
}
class Hello437{
    {
        System.out.println("I.B Hello");
        class Inner437{}
    }
    static {
        System.out.println("S.B Hello");
    }
    Hello437(){
        System.out.println("D.C Hello");
        class Inner437{}
    }
    void m1(){
        System.out.println("m1()-Hello");
        class Inner437{}
    }
}
