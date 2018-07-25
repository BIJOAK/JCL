package com.bijo.learning.interfaces;

public class Lab414 {
    public static void main(String[] args) {
        System.out.println("Hello Guys");
        Inter414 ref=null;
//        ref=new Inter414();
        ref=new Hello414();
        ref.m1();
        ref.m2();
    }
}
interface Inter414{
    void m1();
    public abstract void m2();
    int A=10;
    public final int B=20;
}

class Hello414 implements Inter414{
    public void m1(){
        System.out.println("Hello-->m1()"+A);
    }
    public void m2(){
        System.out.println("Hello-->m2()"+B);
    }

}