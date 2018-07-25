package com.bijo.learning.interfaces;

public class Lab415 {
    public static void main(String[] args) {
        Inter415 ref=new Hai415();
        ref.m1();
        ref.m2();
//        ref.m3();
        Hai415 h=new Hai415();
        h.m3();

    }
}
interface Inter415{
    void m1();
    public void m2();
    int A=10;
    public final int B=20;
}

abstract class Hello415 implements Inter415{
    public void m1(){
        System.out.println("Hello-->m1()"+A);
    }
}
class Hai415 extends Hello415{
    public void m2(){
        System.out.println("Hai-->m2()"+B);
    }
    void m3(){
        System.out.println("Hai-->m3()");
    }
}