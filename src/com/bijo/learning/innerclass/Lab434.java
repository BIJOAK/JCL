package com.bijo.learning.innerclass;

public class Lab434 {
    public static void main(String[] args) {
        Outer434 outobj=new Outer434();
        outobj.m1();
        outobj.m2();
        Outer434.m2();
        Outer434.Inner434 inobj=new Outer434().new Inner434();
        inobj.show();
    }
}

class Outer434{
    int a=10;
    static int b=20;
    void m1(){
        System.out.println("Outer-->m1()");
    }
    static void m2(){
        System.out.println("Outer-->m2()");
    }
    class Inner434{
        int x=11;
        void show(){
            System.out.println("Inner-->show()");
            System.out.println(a);
            System.out.println(b);
            System.out.println(x);
            m1();
            m2();
        }
    }

}
