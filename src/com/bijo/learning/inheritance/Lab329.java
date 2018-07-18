package com.bijo.learning.inheritance;

public class Lab329 {
    public static void main(String[] args) {

        B329 bobj=new B329();
        bobj.m1();
        bobj.m2();

        C329 cobj=new C329();
        cobj.m1();
        cobj.m3();
    }
}
class A329{
    void m1(){
        System.out.println("A-->m1()");
    }
}
class B329 extends A329{
    void m2(){
        System.out.println("B-->m2()");
    }
}
class C329 extends A329{
    void m3(){
        System.out.println("C-->m3()");
    }
}

