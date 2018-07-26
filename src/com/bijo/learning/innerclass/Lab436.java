package com.bijo.learning.innerclass;

public class Lab436 {
    public static void main(String[] args) {
        Outer436 outobj=new Outer436();
        outobj.m1();
        outobj.m2();
        Outer436.Inner436 inobj=new Outer436.Inner436();
        inobj.show();
        inobj.m3();
    }
}
class Outer436{
    int a=10;
    static int b=20;
    void m1(){
        System.out.println("Outer-->m1()");
    }
    static void m2(){
        System.out.println("Outer-->m2()");
    }

    static class Inner436{
        int x=11;
        static int y=22;
        void show(){
            System.out.println("Inner-->show()");
            System.out.println(b);
            System.out.println(x);
            System.out.println(y);
            m2();
        }
        static void m3(){
            System.out.println("Inner-->m3()");
        }
    }
}