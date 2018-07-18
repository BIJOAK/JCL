package com.bijo.learning.inheritance;

public class Lab328 {
    public static void main(String[] args) {
        C328 cobj=new C328();
        cobj.m1();
        cobj.m2();
        cobj.m3();
    }
}
class A328{
    void m1(){
        System.out.println("A-->m1()");
    }
}
class B328 extends A328{
    void m2(){
        System.out.println("B-->m2()");
    }
}
class C328 extends B328{
    void m3(){
        System.out.println("C-->m3()");
    }
}

