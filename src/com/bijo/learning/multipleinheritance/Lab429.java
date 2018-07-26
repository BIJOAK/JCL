package com.bijo.learning.multipleinheritance;

public class Lab429 {
    public static void main(String[] args) {
        A aobj=new D();
        B bojb=new B();
        C cobj=new C();
        D dobj=new D();
        System.out.println(aobj==dobj);
        System.out.println(aobj==bojb);
        System.out.println(aobj==cobj);
    }
}
