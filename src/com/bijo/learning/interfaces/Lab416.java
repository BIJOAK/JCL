package com.bijo.learning.interfaces;

public class Lab416 {
    public static void main(String[] args) {
        Hello416 h=new Hello416();
        System.out.println(h.A);
        System.out.println(h.B);
        h.m1();
        h.m2();
    }
}
interface Inter416A{
    void m1();
    int A=10;
}
interface Inter416B{
    void m2();
    int B=11;

}
class Hello416 implements Inter416A,Inter416B{
    public void m1(){
        System.out.println("Hello-->m1()");
    }
    public void m2(){
        System.out.println("Hello-->m2()");
    }
}